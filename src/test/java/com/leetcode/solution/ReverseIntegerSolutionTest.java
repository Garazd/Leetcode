package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerSolutionTest {
    private ReverseIntegerSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseIntegerSolution();
    }

    @ParameterizedTest
    @MethodSource
    void reverse(int target, int expected) {
        int result = solution.reverse(target);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> reverse() {
        return Stream.of(
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(120, 21)
        );
    }
}
