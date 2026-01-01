package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysSolutionTest {
    private MedianOfTwoSortedArraysSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MedianOfTwoSortedArraysSolution();
    }

    @ParameterizedTest
    @MethodSource
    void isValid(int[] nums1, int[] nums2, double expected) {
        final double result = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> isValid() {
        return Stream.of(
                Arguments.of(new int[]{1, 3}, new int[]{2}, 2),
                Arguments.of(new int[]{1, 2}, new int[]{3, 4}, 2.5),
                Arguments.of(new int[]{2, 2, 4, 4}, new int[]{2, 2, 2, 4, 4}, 2)
        );
    }
}
