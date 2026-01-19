package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstringSolutionTest {
    private LongestPalindromicSubstringSolution solution;

    @BeforeEach
    void setUp() {
        solution = new LongestPalindromicSubstringSolution();
    }

    @ParameterizedTest
    @MethodSource
    void longestPalindrome(String target, String expected) {
        String result = solution.longestPalindrome(target);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> longestPalindrome() {
        return Stream.of(
                Arguments.of("babad", "bab"),
                Arguments.of("cbbd", "bb")
        );
    }
}
