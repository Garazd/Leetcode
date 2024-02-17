package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArray2SolutionTest {
    private RemoveDuplicatesFromSortedArray2Solution solution;

    @BeforeEach
    void setUp() {
        solution = new RemoveDuplicatesFromSortedArray2Solution();
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
                Arguments.of(new int[]{1, 1, 1, 2, 2, 3}, 5, new int[]{1, 1, 2, 2, 3, 3}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}, 7, new int[]{0, 0, 1, 1, 2, 3, 3, 3, 3})
        );
    }
}
