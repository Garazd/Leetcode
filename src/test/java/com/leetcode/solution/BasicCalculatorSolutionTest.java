package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicCalculatorSolutionTest {
    private BasicCalculatorSolution solution;

    @BeforeEach
    void setUp() {
        solution = new BasicCalculatorSolution();
    }

    @ParameterizedTest
    @MethodSource
    void calculate(String string, int expected) {
        final int result = solution.calculate(string);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> calculate() {
        return Stream.of(
                Arguments.of("1 + 1", 2),
                Arguments.of(" 2-1 + 2 ", 3),
                Arguments.of("(1+(4+5+2)-3)+(6+8)", 23)
        );
    }
}
