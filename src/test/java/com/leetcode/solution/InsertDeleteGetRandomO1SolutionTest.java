package com.leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InsertDeleteGetRandomO1SolutionTest {
    private InsertDeleteGetRandomO1Solution solution;

    @BeforeEach
    void setUp() {
        solution = new InsertDeleteGetRandomO1Solution();
    }

    @Test
    void insertDeleteGetRandom() {
        boolean insertOneResultTrue = solution.insert(1);
        int getRandomResultOne = solution.getRandom();
        boolean removeResultFalse = solution.remove(2);
        boolean insertTwoResultTrue = solution.insert(2);
        boolean removeResultTrue = solution.remove(1);
        int getRandomResultTwo = solution.getRandom();

        assertTrue(insertOneResultTrue);
        assertEquals(1, getRandomResultOne);
        assertFalse(removeResultFalse);
        assertTrue(insertTwoResultTrue);
        assertTrue(removeResultTrue);
        assertEquals(2, getRandomResultTwo);
    }
}
