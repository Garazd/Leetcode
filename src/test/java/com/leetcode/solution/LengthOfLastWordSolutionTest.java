package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordSolutionTest {
    private LengthOfLastWordSolution solution;

    @BeforeEach
    void setUp() {
        solution = new LengthOfLastWordSolution();
    }

    @ParameterizedTest
    @MethodSource
    void lengthOfLastWord(String string, int expected) {
        int result = solution.lengthOfLastWord(string);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> lengthOfLastWord() {
        return Stream.of(
                Arguments.of("Hello World", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("luffy is still joyboy", 6)
        );
    }
}
