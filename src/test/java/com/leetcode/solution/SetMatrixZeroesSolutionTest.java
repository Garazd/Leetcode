package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SetMatrixZeroesSolutionTest {
    private SetMatrixZeroesSolution solution;

    @BeforeEach
    void setUp() {
        solution = new SetMatrixZeroesSolution();
    }

    @ParameterizedTest
    @MethodSource
    void spiralOrder(int[][] board, int[][] expected) {
        int[][] result = solution.setZeroes(board);

        assertArrayEquals(expected, result);
    }

    public static Stream<Arguments> spiralOrder() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}},
                        new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}),
                Arguments.of(new int[][]{{1}, {0}},
                        new int[][]{{0}, {0}}),
                Arguments.of(new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}},
                        new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}})
        );
    }
}
