package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SymmetricTreeSolutionTest {
    private SymmetricTreeSolution solution;

    @BeforeEach
    void setUp() {
        solution = new SymmetricTreeSolution();
    }

    @Test
    void shouldReturnTrue() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        final TreeNode firstNode3 = new TreeNode(2);
        final TreeNode firstNode4 = new TreeNode(3);
        final TreeNode firstNode5 = new TreeNode(4);
        final TreeNode firstNode6 = new TreeNode(4);
        final TreeNode firstNode7 = new TreeNode(3);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = firstNode4;
        firstNode2.right = firstNode5;
        firstNode3.left = firstNode6;
        firstNode3.right = firstNode7;

        final boolean result = solution.isSymmetric(firstNode1);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalse() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        final TreeNode firstNode3 = new TreeNode(2);
        final TreeNode firstNode4 = new TreeNode(3);
        final TreeNode firstNode5 = new TreeNode(3);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = null;
        firstNode2.right = firstNode4;
        firstNode3.left = null;
        firstNode3.right = firstNode5;

        final boolean result = solution.isSymmetric(firstNode1);

        assertFalse(result);
    }
}
