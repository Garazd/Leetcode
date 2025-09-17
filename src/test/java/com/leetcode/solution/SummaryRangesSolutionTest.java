package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SummaryRangesSolutionTest {
    private SummaryRangesSolution solution;

    @BeforeEach
    void setUp() {
        solution = new SummaryRangesSolution();
    }

    @ParameterizedTest
    @MethodSource
    void summaryRanges(int[] nums, List<String> expected) {
        final List<String> result = solution.summaryRanges(nums);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> summaryRanges() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 4, 5, 7}, List.of("0->2", "4->5", "7")),
                Arguments.of(new int[]{0, 2, 3, 4, 6, 8, 9}, List.of("0", "2->4", "6", "8->9"))
        );
    }
}
