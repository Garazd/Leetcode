package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpGame2SolutionTest {
    private JumpGame2Solution solution;

    @BeforeEach
    void setUp() {
        solution = new JumpGame2Solution();
    }

    @ParameterizedTest
    @MethodSource
    void jump(int[] nums, int expected) {
        int result = solution.jump(nums);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> jump() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1, 1, 4}, 2),
                Arguments.of(new int[]{2, 3, 0, 1, 4}, 2)
        );
    }
}
