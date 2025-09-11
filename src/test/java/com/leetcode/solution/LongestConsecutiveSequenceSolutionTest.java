package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceSolutionTest {
    private LongestConsecutiveSequenceSolution solution;

    @BeforeEach
    void setUp() {
        solution = new LongestConsecutiveSequenceSolution();
    }

    @ParameterizedTest
    @MethodSource
    void longestConsecutive(int[] nums, int expected) {
        int result = solution.longestConsecutive(nums);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> longestConsecutive() {
        return Stream.of(
                Arguments.of(new int[]{100, 4, 200, 1, 3, 2}, 4),
                Arguments.of(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}, 9),
                Arguments.of(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}, 7),
                Arguments.of(new int[]{0, -1}, 2),
                Arguments.of(new int[]{1, 0, -1}, 3),
                Arguments.of(new int[]{1, 0, 1, 2}, 3)
        );
    }
}
