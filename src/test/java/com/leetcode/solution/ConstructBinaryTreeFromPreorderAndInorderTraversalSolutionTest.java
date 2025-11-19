package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructBinaryTreeFromPreorderAndInorderTraversalSolutionTest {
    private ConstructBinaryTreeFromPreorderAndInorderTraversalSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ConstructBinaryTreeFromPreorderAndInorderTraversalSolution();
    }

    @Test
    void shouldReturnBuildTree() {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        final TreeNode firstNode1 = new TreeNode(3);
        final TreeNode firstNode2 = new TreeNode(9);
        final TreeNode firstNode3 = new TreeNode(20);
        final TreeNode firstNode4 = new TreeNode(15);
        final TreeNode firstNode5 = new TreeNode(7);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = null;
        firstNode2.right = null;
        firstNode3.left = firstNode4;
        firstNode3.right = firstNode5;

        final TreeNode result = solution.buildTree(preorder, inorder);

        assertEquals(firstNode1, result);
    }

    @Test
    void shouldReturnTree() {
        int[] preorder = new int[]{-1};
        int[] inorder = new int[]{-1};
        final TreeNode firstNode1 = new TreeNode(-1);
        firstNode1.left = null;
        firstNode1.right = null;

        final TreeNode result = solution.buildTree(preorder, inorder);

        assertEquals(firstNode1, result);
    }
}
