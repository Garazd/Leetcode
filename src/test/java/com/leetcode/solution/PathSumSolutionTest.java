package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathSumSolutionTest {
    private PathSumSolution solution;

    @BeforeEach
    void setUp() {
        solution = new PathSumSolution();
    }

    @ParameterizedTest
    @MethodSource
    void hasPathSum(int num, int expected) {
        int result = solution.hasPathSum(num);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> hasPathSum() {
        return Stream.of(
                Arguments.of(12, 3),
                Arguments.of(16, 1),
                Arguments.of(71, 4),
                Arguments.of(13, 2)
        );
    }
}
