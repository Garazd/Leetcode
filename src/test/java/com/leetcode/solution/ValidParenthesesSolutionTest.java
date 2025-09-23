package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParenthesesSolutionTest {
    private ValidParenthesesSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ValidParenthesesSolution();
    }

    @ParameterizedTest
    @MethodSource
    void groupAnagrams(String string, boolean expected) {
        final boolean result = solution.isValid(string);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> groupAnagrams() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("([])", true),
                Arguments.of("([)]", false),
                Arguments.of("(", false),
                Arguments.of("){", false),
                Arguments.of("((", false)
        );
    }
}
