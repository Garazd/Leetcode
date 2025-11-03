package com.leetcode.solution;

class ZigzagTraverseSolution {
    public static int[] zigzagTraverse(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int row = rows - 1;
        int col = cols - 1;
        int[] traversalPath = new int[rows * cols];
        int index = 0;
        boolean condition = true;

        // 304 204 104 103 203 303 302 202 102 101 201 301
        while (index < rows * cols) {
            traversalPath[index++] = grid[row][col];
            if (condition) {
                if (row - 1 < 0) {
                    condition = false;
                    col--;
                } else {
                    row--;
                }
            } else {
                if (row + 1 == rows) {
                    condition = true;
                    col--;
                } else {
                    row++;
                }
            }
        }

        return traversalPath;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {101, 102, 103, 104},
                {201, 202, 203, 204},
                {301, 302, 303, 304}
        };

        int[] traversalPath = zigzagTraverse(grid);
        for (final int num : traversalPath) {
            System.out.println(num + " ");
        }
    }
}
