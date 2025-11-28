package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeMaximumPathSumSolutionTest {
    private BinaryTreeMaximumPathSumSolution solution;

    @BeforeEach
    void setUp() {
        solution = new BinaryTreeMaximumPathSumSolution();
    }

    @Test
    void shouldReturnMaxPathSum() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        final TreeNode firstNode3 = new TreeNode(3);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;

        final int result = solution.maxPathSum(firstNode1);

        assertEquals(6, result);
    }

    @Test
    void shouldReturnCalculateMaxPathSum() {
        final TreeNode firstNode1 = new TreeNode(-10);
        final TreeNode firstNode2 = new TreeNode(9);
        final TreeNode firstNode3 = new TreeNode(20);
        final TreeNode firstNode4 = new TreeNode(15);
        final TreeNode firstNode5 = new TreeNode(7);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode3.left = firstNode4;
        firstNode3.right = firstNode5;

        final int result = solution.maxPathSum(firstNode1);

        assertEquals(42, result);
    }
}
