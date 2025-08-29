package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordPatternSolutionTest {
    private WordPatternSolution solution;

    @BeforeEach
    void setUp() {
        solution = new WordPatternSolution();
    }

    @ParameterizedTest
    @MethodSource
    void isWordPattern(String pattern, String string, boolean expected) {
        boolean result = solution.wordPattern(pattern, string);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> isWordPattern() {
        return Stream.of(
                Arguments.of("abba", "dog cat cat dog", true),
                Arguments.of("abba", "dog cat cat fish", false),
                Arguments.of("abba", "dog dog dog dog", false),
                Arguments.of("aaaa", "dog cat cat dog", false)
        );
    }
}
