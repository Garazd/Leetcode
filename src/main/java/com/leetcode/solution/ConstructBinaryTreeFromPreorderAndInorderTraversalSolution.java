package com.leetcode.solution;

import com.leetcode.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>Construct Binary Tree from Preorder and Inorder Traversal</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree
 * and inorder is the inorder traversal of the same tree, construct and return the binary tree.</p>
 *
 * @see <a href="https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/">105. Construct Binary Tree from Preorder and Inorder Traversal</a>
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversalSolution {
    private int[] preorder;
    private final Map<Integer, Integer> inorderIndexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        final int totalNodes = preorder.length;
        this.preorder = preorder;

        for (int index = 0; index < totalNodes; index++) {
            inorderIndexMap.put(inorder[index], index);
        }

        return buildSubtree(0, 0, totalNodes);
    }

    private TreeNode buildSubtree(int preorderIndex, int inorderStart, int subtreeSize) {
        if (subtreeSize <= 0) {
            return null;
        }

        final int rootValue = preorder[preorderIndex];
        final int inorderRootIndex = inorderIndexMap.get(rootValue);

        final int leftSubtreeSize = inorderRootIndex - inorderStart;
        final int rightSubtreeSize = subtreeSize - 1 - leftSubtreeSize;

        final TreeNode leftChild =
                buildSubtree(preorderIndex + 1, inorderStart, leftSubtreeSize);

        final TreeNode rightChild =
                buildSubtree(
                        preorderIndex + 1 + leftSubtreeSize,
                        inorderRootIndex + 1,
                        rightSubtreeSize
                );

        return new TreeNode(rootValue, leftChild, rightChild);
    }
}
