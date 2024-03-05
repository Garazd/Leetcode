package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerToRomanSolutionTest {
    private IntegerToRomanSolution solution;

    @BeforeEach
    void setUp() {
        solution = new IntegerToRomanSolution();
    }

    @ParameterizedTest
    @MethodSource
    void romanToInt(int num, String expected) {
        String result = solution.intToRoman(num);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> romanToInt() {
        return Stream.of(
                Arguments.of(3, "III"),
                Arguments.of(58, "LVIII"),
                Arguments.of(1994, "MCMXCIV")
        );
    }
}
