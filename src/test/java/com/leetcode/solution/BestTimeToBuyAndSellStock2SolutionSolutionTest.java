package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStock2SolutionSolutionTest {
    private BestTimeToBuyAndSellStock2Solution solution;

    @BeforeEach
    void setUp() {
        solution = new BestTimeToBuyAndSellStock2Solution();
    }

    @ParameterizedTest
    @MethodSource
    void maxProfit(int[] nums, int expected) {
        int result = solution.maxProfit(nums);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> maxProfit() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 7),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }
}
