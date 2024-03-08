package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInStringSolutionTest {
    private ReverseWordsInStringSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseWordsInStringSolution();
    }

    @ParameterizedTest
    @MethodSource
    void reverseWords(String strings, String expected) {
        String result = solution.reverseWords(strings);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> reverseWords() {
        return Stream.of(
                Arguments.of("the sky is blue", "blue is sky the"),
                Arguments.of("  hello world  ", "world hello"),
                Arguments.of("a good   example", "example good a")
        );
    }
}
