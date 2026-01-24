package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegularExpressionMatchingSolutionTest {
    private RegularExpressionMatchingSolution solution;

    @BeforeEach
    void setUp() {
        solution = new RegularExpressionMatchingSolution();
    }

    @ParameterizedTest
    @MethodSource
    void threeSum(String string, String pattern, boolean expected) {
        boolean result = solution.isMatch(string, pattern);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> threeSum() {
        return Stream.of(
                Arguments.of("aa", "a", false),
                Arguments.of("aa", "a*", true),
                Arguments.of("ab", ".*", true)
        );
    }
}
