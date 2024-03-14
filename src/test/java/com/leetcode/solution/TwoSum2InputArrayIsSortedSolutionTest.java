package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSum2InputArrayIsSortedSolutionTest {
    private TwoSum2InputArrayIsSortedSolution solution;

    @BeforeEach
    void setUp() {
        solution = new TwoSum2InputArrayIsSortedSolution();
    }

    @ParameterizedTest
    @MethodSource
    void twoSum(int[] numbers, int target, int[] expected) {
        int[] result = solution.twoSum(numbers, target);

        assertArrayEquals(expected, result);
    }

    public static Stream<Arguments> twoSum() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
                Arguments.of(new int[]{2, 3, 4}, 6, new int[]{1, 3}),
                Arguments.of(new int[]{-1, 0}, -1, new int[]{1, 2})
        );
    }
}
