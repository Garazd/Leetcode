package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CountCompleteTreeNodesSolutionTest {
    private CountCompleteTreeNodesSolution solution;

    @BeforeEach
    void setUp() {
        solution = new CountCompleteTreeNodesSolution();
    }

    @Test
    void shouldReturnCountNodes() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        final TreeNode firstNode3 = new TreeNode(3);
        final TreeNode firstNode4 = new TreeNode(4);
        final TreeNode firstNode5 = new TreeNode(5);
        final TreeNode firstNode6 = new TreeNode(6);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = firstNode4;
        firstNode2.right = firstNode5;
        firstNode3.right = firstNode6;

        final int result = solution.countNodes(firstNode1);

        assertEquals(6, result);
    }

    @Test
    void shouldReturnEmptyCountNodes() {
        final TreeNode firstNode1 = null;

        final int result = solution.countNodes(firstNode1);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnOneCountNode() {
        final TreeNode firstNode1 = new TreeNode(1);

        final int result = solution.countNodes(firstNode1);

        assertEquals(1, result);
    }
}
