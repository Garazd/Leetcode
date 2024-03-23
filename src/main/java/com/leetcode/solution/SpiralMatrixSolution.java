package com.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Spiral Matrix</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given an m x n matrix, return all elements of the matrix in spiral order.</p>
 *
 * @see <a href="https://leetcode.com/problems/spiral-matrix/description/">36. Spiral Matrix</a>
 */
public class SpiralMatrixSolution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
