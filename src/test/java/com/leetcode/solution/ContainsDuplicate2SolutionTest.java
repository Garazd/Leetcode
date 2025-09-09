package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainsDuplicate2SolutionTest {
    private ContainsDuplicate2Solution solution;

    @BeforeEach
    void setUp() {
        solution = new ContainsDuplicate2Solution();
    }

    @ParameterizedTest
    @MethodSource
    void isHappy(int[] nums, int number, boolean expected) {
        boolean result = solution.containsNearbyDuplicate(nums, number);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> isHappy() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, 3, true),
                Arguments.of(new int[]{1, 0, 1, 1}, 1, true),
                Arguments.of(new int[]{1, 2, 3, 1, 2, 3}, 2, false)
        );
    }
}
