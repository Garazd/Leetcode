package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsSolutionTest {
    private GroupAnagramsSolution solution;

    @BeforeEach
    void setUp() {
        solution = new GroupAnagramsSolution();
    }

    @ParameterizedTest
    @MethodSource
    void groupAnagrams(String[] arguments, List<List<String>> expected) {
        final List<List<String>> result = solution.groupAnagrams(arguments);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> groupAnagrams() {
        return Stream.of(
                Arguments.of(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"},
                        List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat"))),
                Arguments.of(new String[]{"abets", "bead", "remain", "betas", "abed", "baste", "airline", "leading",
                                "beast", "dealing", "beats", "airmen", "marine", "single", "bade", "aligned"},
                        List.of(List.of("abets", "betas", "baste", "beast", "beats"), List.of("airline"),
                                List.of("leading", "dealing", "aligned"), List.of("remain", "airmen", "marine"),
                                List.of("single"), List.of("bead", "abed", "bade"))),
                Arguments.of(new String[]{},
                        List.of(List.of(""))),
                Arguments.of(new String[]{"", "b"},
                        List.of(List.of(""), List.of("b"))),
                Arguments.of(new String[]{"a"},
                        List.of(List.of("a")))
        );
    }
}
