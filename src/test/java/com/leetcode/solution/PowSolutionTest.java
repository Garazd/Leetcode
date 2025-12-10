package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowSolutionTest {
    private PowSolution solution;

    @BeforeEach
    void setUp() {
        solution = new PowSolution();
    }

    @ParameterizedTest
    @MethodSource
    void isValid(double x, int n, double expected) {
        final double result = solution.myPow(x, n);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> isValid() {
        return Stream.of(
                Arguments.of(2.00, 10, 1024),
                Arguments.of(2.10, 3, 9.261),
                Arguments.of(2, -2, 0.25)
        );
    }
}
