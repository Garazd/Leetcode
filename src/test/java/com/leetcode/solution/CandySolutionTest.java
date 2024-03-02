package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CandySolutionTest {
    private CandySolution solution;

    @BeforeEach
    void setUp() {
        solution = new CandySolution();
    }

    @ParameterizedTest
    @MethodSource
    void candy(int[] gas, int expected) {
        int result = solution.candy(gas);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> candy() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 2}, 5),
                Arguments.of(new int[]{1, 2, 2}, 4)
        );
    }
}
