package com.leetcode.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCacheSolutionTest {

    @Test
    void shouldReturnEqualsValue() {
        final LRUCacheSolution solution = new LRUCacheSolution(2);
        solution.put(1, 1);
        solution.put(2, 2);
        assertEquals(1, solution.get(1));
        solution.put(3, 3);
        assertEquals(-1, solution.get(2));
        solution.put(4, 4);
        assertEquals(-1, solution.get(1));
        assertEquals(3, solution.get(3));
        assertEquals(4, solution.get(4));
    }
}
