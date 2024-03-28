package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsomorphicStringsSolutionTest {
    private IsomorphicStringsSolution solution;

    @BeforeEach
    void setUp() {
        solution = new IsomorphicStringsSolution();
    }

    @ParameterizedTest
    @MethodSource
    void isIsomorphic(String s, String t, boolean expected) {
        boolean result = solution.isIsomorphic(s, t);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> isIsomorphic() {
        return Stream.of(
                Arguments.of("egg", "add", true),
                Arguments.of("paper", "title", true),
                Arguments.of("foo", "bar", false)
        );
    }
}
