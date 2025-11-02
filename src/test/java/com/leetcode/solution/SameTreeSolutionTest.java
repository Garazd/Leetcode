package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SameTreeSolutionTest {
    private SameTreeSolution solution;

    @BeforeEach
    void setUp() {
        solution = new SameTreeSolution();
    }

    @Test
    void shouldReturnTrue() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        final TreeNode firstNode3 = new TreeNode(3);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;

        final TreeNode node1 = new TreeNode(1);
        final TreeNode node2 = new TreeNode(2);
        final TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;

        final boolean result = solution.isSameTree(firstNode1, node1);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalse() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        firstNode1.left = firstNode2;

        final TreeNode node1 = new TreeNode(1);
        final TreeNode node2 = new TreeNode(2);
        node1.left = null;
        node1.right = node2;

        final boolean result = solution.isSameTree(firstNode1, node1);

        assertFalse(result);
    }

    @Test
    void shouldReturnFalseSecond() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        final TreeNode firstNode3 = new TreeNode(1);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;

        final TreeNode node1 = new TreeNode(1);
        final TreeNode node2 = new TreeNode(1);
        final TreeNode node3 = new TreeNode(2);
        node1.left = node2;
        node1.right = node3;

        final boolean result = solution.isSameTree(firstNode1, node1);

        assertFalse(result);
    }
}
