package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsSubsequenceSolutionTest {
    private IsSubsequenceSolution solution;

    @BeforeEach
    void setUp() {
        solution = new IsSubsequenceSolution();
    }

    @ParameterizedTest
    @MethodSource
    void isSubsequence(String s, String t, boolean expected) {
        boolean result = solution.isSubsequence(s, t);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> isSubsequence() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("b", "abc", true),
                Arguments.of("axc", "ahbgdc", false),
                Arguments.of("acb", "ahbgdc", false)
        );
    }
}
