package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWaterSolutionTest {
    private TrappingRainWaterSolution solution;

    @BeforeEach
    void setUp() {
        solution = new TrappingRainWaterSolution();
    }

    @ParameterizedTest
    @MethodSource
    void candy(int[] height, int expected) {
        int result = solution.trap(height);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> candy() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, 6),
                Arguments.of(new int[]{4, 2, 0, 3, 2, 5}, 9)
        );
    }
}
