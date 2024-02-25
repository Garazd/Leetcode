package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HIndexSolutionTest {
    private HIndexSolution solution;

    @BeforeEach
    void setUp() {
        solution = new HIndexSolution();
    }

    @ParameterizedTest
    @MethodSource
    void hIndex(int[] nums, int expected) {
        int result = solution.hIndex(nums);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> hIndex() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 6, 1, 5}, 3),
                Arguments.of(new int[]{0}, 0),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{1, 2, 2}, 2),
                Arguments.of(new int[]{1, 3, 1}, 1)
        );
    }
}
