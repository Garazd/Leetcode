package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HappyNumberSolutionTest {
    private HappyNumberSolution solution;

    @BeforeEach
    void setUp() {
        solution = new HappyNumberSolution();
    }

    @ParameterizedTest
    @MethodSource
    void isHappy(int numbers, boolean expected) {
        boolean result = solution.isHappy(numbers);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> isHappy() {
        return Stream.of(
                Arguments.of(19, true),
                Arguments.of(2, false),
                Arguments.of(3, false)
        );
    }
}
