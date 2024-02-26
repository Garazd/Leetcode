package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HIndex2SolutionTest {
    private HIndex2Solution solution;

    @BeforeEach
    void setUp() {
        solution = new HIndex2Solution();
    }

    @ParameterizedTest
    @MethodSource
    void hIndex(int[] nums, int expected) {
        int result = solution.hIndex(nums);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> hIndex() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 3, 5, 6}, 3),
                Arguments.of(new int[]{1, 2, 100}, 2)
        );
    }
}
