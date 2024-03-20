package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RansomNoteSolutionTest {
    private RansomNoteSolution solution;

    @BeforeEach
    void setUp() {
        solution = new RansomNoteSolution();
    }

    @ParameterizedTest
    @MethodSource
    void canConstruct(String ransomNote, String magazine, boolean expected) {
        boolean result = solution.canConstruct(ransomNote, magazine);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> canConstruct() {
        return Stream.of(
                Arguments.of("a", "b", false),
                Arguments.of("aa", "ab", false),
                Arguments.of("aab", "baa", true),
                Arguments.of("aa", "aab", true)
        );
    }
}
