package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpGameSolutionTest {
    private JumpGameSolution solution;

    @BeforeEach
    void setUp() {
        solution = new JumpGameSolution();
    }

    @ParameterizedTest
    @MethodSource
    void canJump(int[] nums, boolean expected) {
        boolean result = solution.canJump(nums);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> canJump() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1, 1, 4}, true),
                Arguments.of(new int[]{3, 2, 1, 0, 4}, false)
        );
    }
}
