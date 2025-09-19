package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InsertIntervalSolutionTest {
    private InsertIntervalSolution solution;

    @BeforeEach
    void setUp() {
        solution = new InsertIntervalSolution();
    }

    @ParameterizedTest
    @MethodSource
    void summaryRanges(int[][] intervals, int[] newInterval, int[][] expected) {
        final int[][] result = solution.insert(intervals, newInterval);

        assertTrue(Arrays.deepEquals(expected, result));
    }

    public static Stream<Arguments> summaryRanges() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}, new int[][]{{1, 5}, {6, 9}}),
                Arguments.of(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}, new int[][]{{1, 2}, {3, 10}, {12, 16}}),
                Arguments.of(new int[][]{{}}, new int[]{5, 7}, new int[][]{{5, 7}})
        );
    }
}
