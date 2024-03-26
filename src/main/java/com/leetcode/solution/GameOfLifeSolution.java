package com.leetcode.solution;

/**
 * <b>Game of Life</b>
 * <p>Level: <i>Medium</i></p>
 * <p>The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1)
 * or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal)
 * using the following four rules (taken from the above Wikipedia article):
 * Any live cell with fewer than two live neighbors dies as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population.
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * The next state is created by applying the above rules simultaneously to every cell in the current state,
 * where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.</p>
 *
 * @see <a href="https://leetcode.com/problems/game-of-life/description/">289. Game of Life</a>
 */
public class GameOfLifeSolution {
    public int[][] gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                encode(board, i, j);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                update(board, i, j);
            }
        }
        return board;
    }

    void encode(int[][] board, int i, int j) {
        int aliveCount = 0;
        for (int r = -1; r <= 1; r++) {
            for (int c = -1; c <= 1; c++) {
                int nearRow = i + r;
                int nearColumn = j + c;
                if (nearRow >= 0 && nearRow < board.length && nearColumn >= 0 && nearColumn < board[0].length) {
                    int nearVal = board[nearRow][nearColumn];
                    if (r == -1 || (r == 0 && c == -1)) {
                        nearVal = nearVal / 10;
                    }
                    if (nearVal == 1 && !(r == 0 && c == 0)) {
                        aliveCount++;
                    }
                }
            }
        }
        board[i][j] = board[i][j] * 10 + aliveCount;
    }

    void update(int[][] board, int i, int j) {
        int nearCount = board[i][j] % 10;
        boolean isAlive = board[i][j] / 10 == 1;
        if (isAlive && (nearCount < 2 || nearCount > 3)) {
            board[i][j] = 0;
        } else if (isAlive && (nearCount == 2)) {
            board[i][j] = 1;
        } else if (!isAlive && (nearCount == 3)) {
            board[i][j] = 1;
        } else {
            board[i][j] = isAlive ? 1 : 0;
        }
    }
}
