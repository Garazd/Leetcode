package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZigzagConversionSolutionTest {
    private ZigzagConversionSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ZigzagConversionSolution();
    }

    @ParameterizedTest
    @MethodSource
    void convert(String strings, int numRows, String expected) {
        String result = solution.convert(strings, numRows);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> convert() {
        return Stream.of(
                Arguments.of("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
                Arguments.of("PAYPALISHIRING", 4, "PINALSIGYAHRPI"),
                Arguments.of("A", 1, "A")
        );
    }
}
