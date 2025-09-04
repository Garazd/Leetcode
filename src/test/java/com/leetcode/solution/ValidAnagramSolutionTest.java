package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidAnagramSolutionTest {
    private ValidAnagramSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ValidAnagramSolution();
    }

    @ParameterizedTest
    @MethodSource
    void isAnagram(String pattern, String string, boolean expected) {
        boolean result = solution.isAnagram(pattern, string);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> isAnagram() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false)
        );
    }
}
