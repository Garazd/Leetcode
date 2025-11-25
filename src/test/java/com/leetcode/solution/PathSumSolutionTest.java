package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PathSumSolutionTest {
    private PathSumSolution solution;

    @BeforeEach
    void setUp() {
        solution = new PathSumSolution();
    }

    @Test
    void shouldReturnTrue() {
        final TreeNode firstNode1 = new TreeNode(5);
        final TreeNode firstNode2 = new TreeNode(4);
        final TreeNode firstNode3 = new TreeNode(8);
        final TreeNode firstNode4 = new TreeNode(11);
        final TreeNode firstNode5 = new TreeNode(13);
        final TreeNode firstNode6 = new TreeNode(4);
        final TreeNode firstNode7 = new TreeNode(7);
        final TreeNode firstNode8 = new TreeNode(2);
        final TreeNode firstNode9 = new TreeNode(1);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = firstNode4;
        firstNode3.left = firstNode5;
        firstNode3.right = firstNode6;
        firstNode4.left = firstNode7;
        firstNode4.right = firstNode8;
        firstNode6.right = firstNode9;

        final boolean result = solution.hasPathSum(firstNode1, 22);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalse() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        final TreeNode firstNode3 = new TreeNode(3);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;

        final boolean result = solution.hasPathSum(firstNode1, 5);

        assertFalse(result);
    }

    @Test
    void shouldReturnFalseInEmpty() {
        final TreeNode firstNode1 = null;

        final boolean result = solution.hasPathSum(firstNode1, 0);

        assertFalse(result);
    }

    @Test
    void shouldReturnFalseInSmall() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        firstNode1.left = firstNode2;

        final boolean result = solution.hasPathSum(firstNode1, 1);

        assertFalse(result);
    }
}
