package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMedianFromDataStreamSolutionTest {
    private FindMedianFromDataStreamSolution solution;

    @BeforeEach
    void setUp() {
        solution = new FindMedianFromDataStreamSolution();
    }

    @Test
    void shouldReturnMedian() {
        solution.addNum(1);
        solution.addNum(2);
        assertEquals(1.5, solution.findMedian());
        solution.addNum(3);
        assertEquals(2.0, solution.findMedian());
    }

    @Test
    void shouldReturnMedianNum() {
        solution.addNum(6);
        assertEquals(6, solution.findMedian());
        solution.addNum(10);
        assertEquals(8, solution.findMedian());
        solution.addNum(2);
        assertEquals(6, solution.findMedian());
        solution.addNum(6);
        assertEquals(6, solution.findMedian());
        solution.addNum(5);
        assertEquals(6, solution.findMedian());
        solution.addNum(0);
        assertEquals(5.5, solution.findMedian());
        solution.addNum(6);
        assertEquals(6, solution.findMedian());
        solution.addNum(3);
        assertEquals(5.5, solution.findMedian());
        solution.addNum(1);
        assertEquals(5, solution.findMedian());
        solution.addNum(0);
        assertEquals(4, solution.findMedian());
        solution.addNum(0);
        assertEquals(3, solution.findMedian());
    }
}
