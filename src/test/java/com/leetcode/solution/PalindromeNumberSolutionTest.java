package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeNumberSolutionTest {
    private PalindromeNumberSolution solution;

    @BeforeEach
    void setUp() {
        solution = new PalindromeNumberSolution();
    }

    @ParameterizedTest
    @MethodSource
    void threeSum(int number, boolean expected) {
        boolean result = solution.isPalindrome(number);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> threeSum() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false)
        );
    }
}
