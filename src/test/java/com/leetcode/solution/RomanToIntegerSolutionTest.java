package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerSolutionTest {
    private RomanToIntegerSolution solution;

    @BeforeEach
    void setUp() {
        solution = new RomanToIntegerSolution();
    }

    @ParameterizedTest
    @MethodSource
    void romanToInt(String roman, int expected) {
        int result = solution.romanToInt(roman);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> romanToInt() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)
        );
    }
}
