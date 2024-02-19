package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementSolutionTest {
    private MajorityElementSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MajorityElementSolution();
    }

    @ParameterizedTest
    @MethodSource
    void majorityElement(int[] nums, int expected) {
        int result = solution.majorityElement(nums);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> majorityElement() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{6, 5, 5}, 5),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2}, 2)
        );
    }
}
