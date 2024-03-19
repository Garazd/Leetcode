package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubstringWithConcatenationOfAllWordsSolutionTest {
    private SubstringWithConcatenationOfAllWordsSolution solution;

    @BeforeEach
    void setUp() {
        solution = new SubstringWithConcatenationOfAllWordsSolution();
    }

    @ParameterizedTest
    @MethodSource
    void findSubstring(String string, String[] words, List<Integer> expected) {
        List<Integer> result = solution.findSubstring(string, words);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> findSubstring() {
        return Stream.of(
                Arguments.of("barfoothefoobarman", new String[]{"foo", "bar"}, List.of(0, 9)),
                Arguments.of("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"}, List.of()),
                Arguments.of("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"}, List.of(6, 9, 12))
        );
    }
}
