package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindIndexOfTheFirstOccurrenceStringSolutionTest {
    private FindIndexOfTheFirstOccurrenceStringSolution solution;

    @BeforeEach
    void setUp() {
        solution = new FindIndexOfTheFirstOccurrenceStringSolution();
    }

    @ParameterizedTest
    @MethodSource
    void strStr(String haystack, String needle, int expected) {
        int result = solution.strStr(haystack, needle);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> strStr() {
        return Stream.of(
                Arguments.of("sadbutsad", "sad", 0),
                Arguments.of("leetcode", "leeto", -1),
                Arguments.of("mississippi", "issip", 4)
        );
    }
}
