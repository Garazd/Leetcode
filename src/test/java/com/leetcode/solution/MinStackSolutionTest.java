package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackSolutionTest {
    private MinStackSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MinStackSolution();
    }

    @Test
    void simplifyPath() {
        solution = new MinStackSolution();
        solution.push(-2);
        solution.push(0);
        solution.push(-3);
        int minFirst = solution.getMin();
        assertEquals(-3, minFirst);
        solution.pop();
        int top = solution.top();
        assertEquals(0, top);
        int minSecond = solution.getMin();
        assertEquals(-2, minSecond);
    }
}
