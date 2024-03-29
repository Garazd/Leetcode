package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfSolutionTest {
    private ProductOfArrayExceptSelfSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ProductOfArrayExceptSelfSolution();
    }

    @ParameterizedTest
    @MethodSource
    void productExceptSelf(int[] nums, int[] expected) {
        int[] result = solution.productExceptSelf(nums);

        assertArrayEquals(expected, result);
    }

    public static Stream<Arguments> productExceptSelf() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6}),
                Arguments.of(new int[]{-1, 1, 0, -3, 3}, new int[]{0, 0, 9, 0, 0})
        );
    }
}
