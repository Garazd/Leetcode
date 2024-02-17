package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArraySolutionTest {
    private RemoveDuplicatesFromSortedArraySolution solution;

    @BeforeEach
    void setUp() {
        solution = new RemoveDuplicatesFromSortedArraySolution();
    }

    @ParameterizedTest
    @MethodSource
    void removeDuplicates(int[] nums, int expected, int[] expectedArray) {
        int result = solution.removeDuplicates(nums);

        assertEquals(expected, result);
        assertArrayEquals(expectedArray, nums);
    }

    public static Stream<Arguments> removeDuplicates() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, 2, new int[]{1, 2, 2}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5, new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4})
        );
    }
}
