package com.leetcode.solution;

class ReflectOverSecondaryDiagonalSolution {

    public static int[][] reflectOverSecondaryDiagonal(int[][] matrix) {
        int size = matrix.length;
        int[][] newMatrix = new int[size][size];

        // 9 6 3
        // 8 5 2
        // 7 4 1
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                newMatrix[size - 1 - j][size - 1 - i] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] newMatrix = reflectOverSecondaryDiagonal(squareMatrix);
        for (final int[] matrix : newMatrix) {
            for (int j = 0; j < newMatrix.length; j++) {
                System.out.print(matrix[j] + " ");
            }
            System.out.println();
        }
    }
}
