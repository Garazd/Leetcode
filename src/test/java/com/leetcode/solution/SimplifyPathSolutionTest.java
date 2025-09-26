package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimplifyPathSolutionTest {
    private SimplifyPathSolution solution;

    @BeforeEach
    void setUp() {
        solution = new SimplifyPathSolution();
    }

    @ParameterizedTest
    @MethodSource
    void simplifyPath(String string, String expected) {
        final String result = solution.simplifyPath(string);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> simplifyPath() {
        return Stream.of(
                Arguments.of("/home/", "/home"),
                Arguments.of("/home//foo/", "/home/foo"),
                Arguments.of("/home/user/Documents/../Pictures", "/home/user/Pictures"),
                Arguments.of("/../", "/"),
                Arguments.of("/.../a/../b/c/../d/./", "/.../b/d"),
                Arguments.of("/a/./b/../../c/", "/c")
        );
    }
}
