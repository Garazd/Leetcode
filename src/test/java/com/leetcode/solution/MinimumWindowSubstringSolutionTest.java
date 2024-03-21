package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumWindowSubstringSolutionTest {
    private MinimumWindowSubstringSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MinimumWindowSubstringSolution();
    }

    @ParameterizedTest
    @MethodSource
    void minWindow(String s, String string, String expected) {
        String result = solution.minWindow(s, string);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> minWindow() {
        return Stream.of(
                Arguments.of("ADOBECODEBANC", "ABC", "BANC"),
                Arguments.of("a", "a", "a"),
                Arguments.of("a", "aa", "")
        );
    }
}
