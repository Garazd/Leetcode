package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToIntegerAtoiSolutionTest {
    private StringToIntegerAtoiSolution solution;

    @BeforeEach
    void setUp() {
        solution = new StringToIntegerAtoiSolution();
    }

    @ParameterizedTest
    @MethodSource
    void reverse(String target, int expected) {
        int result = solution.myAtoi(target);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> reverse() {
        return Stream.of(
                Arguments.of("42", 42),
                Arguments.of("    -042", -42),
                Arguments.of("1337c0d3", 1337),
                Arguments.of("0-1", 0),
                Arguments.of("words and 987", 0)
        );
    }
}
