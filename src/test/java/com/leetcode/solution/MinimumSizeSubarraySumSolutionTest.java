package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSizeSubarraySumSolutionTest {
    private MinimumSizeSubarraySumSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MinimumSizeSubarraySumSolution();
    }

    @ParameterizedTest
    @MethodSource
    void minSubArrayLen(int target, int[] numbers, int expected) {
        int result = solution.minSubArrayLen(target, numbers);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> minSubArrayLen() {
        return Stream.of(
                Arguments.of(7, new int[]{2, 3, 1, 2, 4, 3}, 2),
                Arguments.of(213, new int[]{12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12}, 8),
                Arguments.of(4, new int[]{1, 4, 4}, 1),
                Arguments.of(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}, 0)
        );
    }
}
