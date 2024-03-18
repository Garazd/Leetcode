package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersSolutionTest {
    private LongestSubstringWithoutRepeatingCharactersSolution solution;

    @BeforeEach
    void setUp() {
        solution = new LongestSubstringWithoutRepeatingCharactersSolution();
    }

    @ParameterizedTest
    @MethodSource
    void lengthOfLongestSubstring(String string, int expected) {
        int result = solution.lengthOfLongestSubstring(string);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> lengthOfLongestSubstring() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3)
        );
    }
}
