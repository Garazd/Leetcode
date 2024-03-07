package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixSolutionTest {
    private LongestCommonPrefixSolution solution;

    @BeforeEach
    void setUp() {
        solution = new LongestCommonPrefixSolution();
    }

    @ParameterizedTest
    @MethodSource
    void longestCommonPrefix(String[] strings, String expected) {
        String result = solution.longestCommonPrefix(strings);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> longestCommonPrefix() {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"a"}, "a"),
                Arguments.of(new String[]{"", ""}, ""),
                Arguments.of(new String[]{"flower", "flower", "flower", "flower"}, "flower"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, "")
        );
    }
}
