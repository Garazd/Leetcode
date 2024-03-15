package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterSolutionTest {
    private ContainerWithMostWaterSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ContainerWithMostWaterSolution();
    }

    @ParameterizedTest
    @MethodSource
    void maxArea(int[] numbers, int expected) {
        int result = solution.maxArea(numbers);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> maxArea() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1)
        );
    }
}
