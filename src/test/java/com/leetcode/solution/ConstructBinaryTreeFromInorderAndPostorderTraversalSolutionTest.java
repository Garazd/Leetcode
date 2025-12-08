package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructBinaryTreeFromInorderAndPostorderTraversalSolutionTest {
    private ConstructBinaryTreeFromInorderAndPostorderTraversalSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ConstructBinaryTreeFromInorderAndPostorderTraversalSolution();
    }

    @Test
    void shouldReturnRightSideView() {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        final TreeNode firstNode1 = new TreeNode(3);
        final TreeNode firstNode2 = new TreeNode(9);
        final TreeNode firstNode3 = new TreeNode(20);
        final TreeNode firstNode4 = new TreeNode(15);
        final TreeNode firstNode5 = new TreeNode(7);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode3.left = firstNode4;
        firstNode3.right = firstNode5;

        final TreeNode result = solution.buildTree(inorder, postorder);

        assertEquals(firstNode1, result);
    }

    @Test
    void shouldReturnRightSide() {
        int[] inorder = {-1};
        int[] postorder = {-1};
        final TreeNode firstNode1 = new TreeNode(-1);

        final TreeNode result = solution.buildTree(inorder, postorder);

        assertEquals(firstNode1, result);
    }
}
