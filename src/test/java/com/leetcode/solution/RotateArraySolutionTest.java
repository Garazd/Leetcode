package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArraySolutionTest {
    private RotateArraySolution solution;

    @BeforeEach
    void setUp() {
        solution = new RotateArraySolution();
    }

    @ParameterizedTest
    @MethodSource
    void rotate(int[] nums, int count, int[] expectedArray) {
        final int[] rotate = solution.rotate(nums, count);

        assertArrayEquals(expectedArray, rotate);
    }

    public static Stream<Arguments> rotate() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}),
                Arguments.of(new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100})
        );
    }
}
