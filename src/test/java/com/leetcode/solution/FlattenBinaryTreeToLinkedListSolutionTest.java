package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlattenBinaryTreeToLinkedListSolutionTest {
    private FlattenBinaryTreeToLinkedListSolution solution;

    @BeforeEach
    void setUp() {
        solution = new FlattenBinaryTreeToLinkedListSolution();
    }

    @Test
    void shouldReturnFlattenTree() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        final TreeNode firstNode3 = new TreeNode(5);
        final TreeNode firstNode4 = new TreeNode(3);
        final TreeNode firstNode5 = new TreeNode(4);
        final TreeNode firstNode6 = new TreeNode(6);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = firstNode4;
        firstNode2.right = firstNode5;
        firstNode3.left = null;
        firstNode3.right = firstNode6;

        final TreeNode resultNode1 = new TreeNode(1);
        final TreeNode resultNode2 = new TreeNode(2);
        final TreeNode resultNode3 = new TreeNode(3);
        final TreeNode resultNode4 = new TreeNode(4);
        final TreeNode resultNode5 = new TreeNode(5);
        final TreeNode resultNode6 = new TreeNode(6);
        resultNode1.left = null;
        resultNode1.right = resultNode2;
        resultNode2.left = null;
        resultNode2.right = resultNode3;
        resultNode3.left = null;
        resultNode3.right = resultNode4;
        resultNode4.left = null;
        resultNode4.right = resultNode5;
        resultNode5.left = null;
        resultNode5.right = resultNode6;

        solution.flatten(firstNode1);

        assertEquals(firstNode1, resultNode1);
    }

    @Test
    void shouldReturnEmptyTree() {
        final TreeNode firstNode1 = null;

        final TreeNode resultNode1 = null;

        solution.flatten(firstNode1);

        assertEquals(firstNode1, resultNode1);
    }

    @Test
    void shouldReturnTree() {
        final TreeNode firstNode1 = new TreeNode(0);

        final TreeNode resultNode1 = new TreeNode(0);

        solution.flatten(firstNode1);

        assertEquals(firstNode1, resultNode1);
    }
}
