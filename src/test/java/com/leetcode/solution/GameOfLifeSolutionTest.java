package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GameOfLifeSolutionTest {
    private GameOfLifeSolution solution;

    @BeforeEach
    void setUp() {
        solution = new GameOfLifeSolution();
    }

    @ParameterizedTest
    @MethodSource
    void gameOfLife(int[][] board, int[][] expected) {
        int[][] result = solution.gameOfLife(board);

        assertArrayEquals(expected, result);
    }

    public static Stream<Arguments> gameOfLife() {
        return Stream.of(
                Arguments.of(new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}},
                        new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}}),
                Arguments.of(new int[][]{{1, 1}, {1, 0}},
                        new int[][]{{1, 1}, {1, 1}})
        );
    }
}
