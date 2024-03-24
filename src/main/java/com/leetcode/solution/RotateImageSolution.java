package com.leetcode.solution;

/**
 * <b>Rotate Image</b>
 * <p>Level: <i>Medium</i></p>
 * <p>You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).</p>
 *
 * @see <a href="https://leetcode.com/problems/rotate-image/description/">48. Rotate Image</a>
 */
public class RotateImageSolution {
    public int[][] rotate(int[][] matrix) {
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length / 2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length - 1 - j];
                matrix[i][length - 1 - j] = temp;
            }
        }
        return matrix;
    }
}
