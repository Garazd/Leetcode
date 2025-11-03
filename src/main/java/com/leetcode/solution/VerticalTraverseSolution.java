package com.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

class VerticalTraverseSolution {
    public static List<Integer> verticalTraverse(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();

        // 12 8 4 11 7 3 10 6 2 9 5 1
        for (int i = matrix[0].length - 1; i >= 0; i--) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                result.add(matrix[j][i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        List<Integer> traversal = verticalTraverse(data);
        for (final int num : traversal) {
            System.out.print(num + " ");
        }
    }
}
