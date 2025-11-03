package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvertBinaryTreeSolutionTest {
    private InvertBinaryTreeSolution solution;

    @BeforeEach
    void setUp() {
        solution = new InvertBinaryTreeSolution();
    }

    @Test
    void shouldReturnInvertBinaryTree() {
        final TreeNode firstNode1 = new TreeNode(4);
        final TreeNode firstNode2 = new TreeNode(2);
        final TreeNode firstNode3 = new TreeNode(7);
        final TreeNode firstNode4 = new TreeNode(1);
        final TreeNode firstNode5 = new TreeNode(3);
        final TreeNode firstNode6 = new TreeNode(6);
        final TreeNode firstNode7 = new TreeNode(9);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = firstNode4;
        firstNode2.right = firstNode5;
        firstNode3.left = firstNode6;
        firstNode3.right = firstNode7;

        final TreeNode node1 = new TreeNode(4);
        final TreeNode node2 = new TreeNode(2);
        final TreeNode node3 = new TreeNode(7);
        final TreeNode node4 = new TreeNode(1);
        final TreeNode node5 = new TreeNode(3);
        final TreeNode node6 = new TreeNode(6);
        final TreeNode node7 = new TreeNode(9);
        node1.left = node3;
        node1.right = node2;
        node2.left = node5;
        node2.right = node4;
        node3.left = node7;
        node3.right = node6;

        final TreeNode result = solution.invertTree(firstNode1);

        assertEquals(node1, result);
    }

    @Test
    void shouldReturnFalse() {
        final TreeNode firstNode1 = new TreeNode(2);
        final TreeNode firstNode2 = new TreeNode(1);
        final TreeNode firstNode3 = new TreeNode(3);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;

        final TreeNode node1 = new TreeNode(2);
        final TreeNode node2 = new TreeNode(3);
        final TreeNode node3 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;

        final TreeNode result = solution.invertTree(firstNode1);

        assertEquals(node1, result);
    }

    @Test
    void shouldReturnEmptyTree() {
        final TreeNode firstNode1 = null;

        final TreeNode node1 = null;

        final TreeNode result = solution.invertTree(firstNode1);

        assertEquals(node1, result);
    }
}
