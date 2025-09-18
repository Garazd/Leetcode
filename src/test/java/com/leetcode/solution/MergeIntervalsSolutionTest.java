package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeIntervalsSolutionTest {
    private MergeIntervalsSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MergeIntervalsSolution();
    }

    @ParameterizedTest
    @MethodSource
    void summaryRanges(int[][] nums, int[][] expected) {
        final int[][] result = solution.merge(nums);

        assertTrue(Arrays.deepEquals(expected, result));
    }

    public static Stream<Arguments> summaryRanges() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}, new int[][]{{1, 6}, {8, 10}, {15, 18}}),
                Arguments.of(new int[][]{{1, 4}, {4, 5}}, new int[][]{{1, 5}}),
                Arguments.of(new int[][]{{4, 7}, {1, 4}}, new int[][]{{1, 7}})
        );
    }
}
