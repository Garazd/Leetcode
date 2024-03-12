package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidPalindromeSolutionTest {
    private ValidPalindromeSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ValidPalindromeSolution();
    }

    @ParameterizedTest
    @MethodSource
    void isPalindrome(String string, boolean expected) {
        boolean result = solution.isPalindrome(string);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> isPalindrome() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of(" ", true),
                Arguments.of("0A", false)
        );
    }
}
