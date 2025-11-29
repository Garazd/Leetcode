package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTreeIteratorSolutionTest {
    private BinarySearchTreeIteratorSolution solution;

    @BeforeEach
    void setUp() {
        solution = new BinarySearchTreeIteratorSolution();
    }

    @Test
    void shouldReturnMaxPathSum() {
        final TreeNode firstNode1 = new TreeNode(7);
        final TreeNode firstNode2 = new TreeNode(3);
        final TreeNode firstNode3 = new TreeNode(15);
        final TreeNode firstNode4 = new TreeNode(9);
        final TreeNode firstNode5 = new TreeNode(20);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode3.left = firstNode4;
        firstNode3.right = firstNode5;

        solution.BSTIterator(firstNode1);
        assertEquals(3, solution.next());
        assertEquals(7, solution.next());
        assertTrue(solution.hasNext());
        assertEquals(9, solution.next());
        assertTrue(solution.hasNext());
        assertEquals(15, solution.next());
        assertTrue(solution.hasNext());
        assertEquals(20, solution.next());
        assertFalse(solution.hasNext());
    }
}
