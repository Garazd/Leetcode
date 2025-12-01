package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LowestCommonAncestorOfBinaryTreeSolutionTest {
    private LowestCommonAncestorOfBinaryTreeSolution solution;

    @BeforeEach
    void setUp() {
        solution = new LowestCommonAncestorOfBinaryTreeSolution();
    }

    @Test
    void shouldReturnCountNodes() {
        final TreeNode firstNode1 = new TreeNode(3);
        final TreeNode firstNode2 = new TreeNode(5);
        final TreeNode firstNode3 = new TreeNode(1);
        final TreeNode firstNode4 = new TreeNode(6);
        final TreeNode firstNode5 = new TreeNode(2);
        final TreeNode firstNode6 = new TreeNode(0);
        final TreeNode firstNode7 = new TreeNode(8);
        final TreeNode firstNode8 = new TreeNode(7);
        final TreeNode firstNode9 = new TreeNode(4);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = firstNode4;
        firstNode2.right = firstNode5;
        firstNode3.left = firstNode6;
        firstNode3.right = firstNode7;
        firstNode5.left = firstNode8;
        firstNode5.right = firstNode9;

        final TreeNode result = solution.lowestCommonAncestor(firstNode1, firstNode2, firstNode3);

        assertEquals(firstNode1, result);
    }

    @Test
    void shouldReturnEmptyCountNodes() {
        final TreeNode firstNode1 = new TreeNode(3);
        final TreeNode firstNode2 = new TreeNode(5);
        final TreeNode firstNode3 = new TreeNode(1);
        final TreeNode firstNode4 = new TreeNode(6);
        final TreeNode firstNode5 = new TreeNode(2);
        final TreeNode firstNode6 = new TreeNode(0);
        final TreeNode firstNode7 = new TreeNode(8);
        final TreeNode firstNode8 = new TreeNode(7);
        final TreeNode firstNode9 = new TreeNode(4);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = firstNode4;
        firstNode2.right = firstNode5;
        firstNode3.left = firstNode6;
        firstNode3.right = firstNode7;
        firstNode5.left = firstNode8;
        firstNode5.right = firstNode9;

        final TreeNode result = solution.lowestCommonAncestor(firstNode1, firstNode2, firstNode9);

        assertEquals(firstNode2, result);
    }

    @Test
    void shouldReturnOneCountNode() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        firstNode1.left = firstNode2;

        final TreeNode result = solution.lowestCommonAncestor(firstNode1, firstNode1, firstNode2);

        assertEquals(firstNode1, result);
    }
}
