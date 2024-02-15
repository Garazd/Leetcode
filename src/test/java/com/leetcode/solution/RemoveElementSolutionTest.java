package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementSolutionTest {
    private RemoveElementSolution solution;

    @BeforeEach
    void setUp() {
        solution = new RemoveElementSolution();
    }

    @ParameterizedTest
    @MethodSource
    void merge(int[] nums, int val, int expected, int[] expectedArray) {
        int result = solution.removeElement(nums, val);

        assertEquals(expected, result);
        assertArrayEquals(expectedArray, nums);
    }

    public static Stream<Arguments> merge() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 2, 3}, 3, 2, new int[]{2, 2, 2, 3}),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5, new int[]{0, 1, 3, 0, 4, 0, 4, 2})
        );
    }
}
