package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateReversePolishNotationSolutionTest {
    private EvaluateReversePolishNotationSolution solution;

    @BeforeEach
    void setUp() {
        solution = new EvaluateReversePolishNotationSolution();
    }

    @ParameterizedTest
    @MethodSource
    void evalRPN(String[] string, int expected) {
        final int result = solution.evalRPN(string);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> evalRPN() {
        return Stream.of(
                Arguments.of(new String[]{"2", "1", "+", "3", "*"}, 9),
                Arguments.of(new String[]{"4", "13", "5", "/", "+"}, 6),
                Arguments.of(new String[]{"4", "-2", "/", "2", "-3", "-", "-"}, -7),
                Arguments.of(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}, 22)
        );
    }
}
