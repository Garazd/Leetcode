package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumSolutionTest {
    private ThreeSumSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ThreeSumSolution();
    }

    @ParameterizedTest
    @MethodSource
    void threeSum(int[] numbers, List<List<Integer>> expected) {
        List<List<Integer>> result = solution.threeSum(numbers);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> threeSum() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                Arguments.of(new int[]{0, 1, 1}, List.of()),
                Arguments.of(new int[]{0, 0, 0}, List.of(List.of(0, 0, 0)))
        );
    }
}
