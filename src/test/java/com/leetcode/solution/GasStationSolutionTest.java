package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GasStationSolutionTest {
    private GasStationSolution solution;

    @BeforeEach
    void setUp() {
        solution = new GasStationSolution();
    }

    @ParameterizedTest
    @MethodSource
    void canCompleteCircuit(int[] gas, int[] cost, int expected) {
        int result = solution.canCompleteCircuit(gas, cost);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> canCompleteCircuit() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}, 3),
                Arguments.of(new int[]{2, 3, 4}, new int[]{3, 4, 3}, -1)
        );
    }
}
