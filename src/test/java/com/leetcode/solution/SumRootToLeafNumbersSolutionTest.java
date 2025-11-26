package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumRootToLeafNumbersSolutionTest {
    private SumRootToLeafNumbersSolution solution;

    @BeforeEach
    void setUp() {
        solution = new SumRootToLeafNumbersSolution();
    }

    @Test
    void shouldReturnSumToLeaf() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        final TreeNode firstNode3 = new TreeNode(3);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;

        final int result = solution.sumNumbers(firstNode1);

        assertEquals(25, result);
    }

    @Test
    void shouldReturnCalculateSumToLeaf() {
        final TreeNode firstNode1 = new TreeNode(4);
        final TreeNode firstNode2 = new TreeNode(9);
        final TreeNode firstNode3 = new TreeNode(0);
        final TreeNode firstNode4 = new TreeNode(5);
        final TreeNode firstNode5 = new TreeNode(1);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = firstNode4;
        firstNode2.right = firstNode5;

        final int result = solution.sumNumbers(firstNode1);

        assertEquals(1026, result);
    }
}
