package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextJustificationSolutionTest {
    private TextJustificationSolution solution;

    @BeforeEach
    void setUp() {
        solution = new TextJustificationSolution();
    }

    @ParameterizedTest
    @MethodSource
    void strStr(String[] words, int maxWidth, List<String> expected) {
        List<String> result = solution.fullJustify(words, maxWidth);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> strStr() {
        return Stream.of(
                Arguments.of(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16,
                        List.of("This    is    an", "example  of text", "justification.  ")),
                Arguments.of(new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to",
                                "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"}, 20,
                        List.of("Science  is  what we", "understand      well", "enough to explain to",
                                "a  computer.  Art is", "everything  else  we", "do                  ")),
                Arguments.of(new String[]{"What", "must", "be", "acknowledgment", "shall", "be"}, 16,
                        List.of("What   must   be", "acknowledgment  ", "shall be        ")));
    }
}
