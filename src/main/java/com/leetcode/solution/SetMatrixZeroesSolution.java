package com.leetcode.solution;

/**
 * <b>Set Matrix Zeroes</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.</p>
 *
 * @see <a href="https://leetcode.com/problems/set-matrix-zeroes/description/">73. Set Matrix Zeroes</a>
 */
public class SetMatrixZeroesSolution {
    public int[][] setZeroes(int[][] matrix) {
        int colLength = matrix.length;
        int rowLength = matrix[0].length;
        int[] row = new int[colLength];
        int[] col = new int[rowLength];
        for (int i = 0; i < colLength; i++) {
            for (int j = 0; j < rowLength; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < colLength; i++) {
            for (int j = 0; j < rowLength; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
