package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerfectSquaresSolutionTest {
    private PerfectSquaresSolution solution;

    @BeforeEach
    void setUp() {
        solution = new PerfectSquaresSolution();
    }

    @ParameterizedTest
    @MethodSource
    void numSquares(int num, int expected) {
        int result = solution.numSquares(num);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> numSquares() {
        return Stream.of(
                Arguments.of(12, 3),
                Arguments.of(16, 1),
                Arguments.of(13, 2)
        );
    }
}
