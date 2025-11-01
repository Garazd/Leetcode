package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfBinaryTreeSolutionTest {
    private MaximumDepthOfBinaryTreeSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MaximumDepthOfBinaryTreeSolution();
    }

    @Test
    void shouldReturnMaxDepth() {
        final TreeNode node1 = new TreeNode(3);
        final TreeNode node2 = new TreeNode(9);
        final TreeNode node3 = new TreeNode(20);
        final TreeNode node4 = new TreeNode(15);
        final TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = null;
        node2.right = null;
        node3.left = node4;
        node3.right = node5;

        final int result = solution.maxDepth(node1);

        assertEquals(3, result);
    }

    @Test
    void shouldReturnMaxDepthSecond() {
        final TreeNode node1 = new TreeNode(1);
        final TreeNode node2 = new TreeNode(2);

        node1.left = null;
        node1.right = node2;

        final int result = solution.maxDepth(node1);

        assertEquals(2, result);
    }

    @Test
    void shouldReturnMaxDepthThird() {
        final TreeNode node1 = new TreeNode(-8);
        final TreeNode node2 = new TreeNode(-6);
        final TreeNode node3 = new TreeNode(7);
        final TreeNode node4 = new TreeNode(6);
        final TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = null;
        node3.left = null;
        node3.right = null;
        node4.left = null;
        node4.right = node5;

        final int result = solution.maxDepth(node1);

        assertEquals(4, result);
    }
}
