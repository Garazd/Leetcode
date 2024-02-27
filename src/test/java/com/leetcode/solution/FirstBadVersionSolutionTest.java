package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstBadVersionSolutionTest {

    @ParameterizedTest
    @MethodSource
    void firstBadVersion(int version, int expected) {
        final FirstBadVersionSolution solution = new FirstBadVersionSolution(expected);

        int result = solution.firstBadVersion(version);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> firstBadVersion() {
        return Stream.of(
                Arguments.of(5, 4),
                Arguments.of(1, 1)
        );
    }
}
