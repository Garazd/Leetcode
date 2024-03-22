package com.leetcode.solution;

import java.util.HashSet;

/**
 * <b>Valid Sudoku</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.</p>
 *
 * @see <a href="https://leetcode.com/problems/valid-sudoku/description/">36. Valid Sudoku</a>
 */
public class ValidSudokuSolution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.') {
                    if (!seen.add(current + " found in row " + i)
                            || !seen.add(current + " found in column " + j)
                            || !seen.add(current + " found in sub box " + i / 3 + " - " + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
