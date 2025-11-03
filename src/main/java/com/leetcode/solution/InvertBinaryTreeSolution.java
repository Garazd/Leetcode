package com.leetcode.solution;

import com.leetcode.util.TreeNode;

/**
 * <b>Invert Binary Tree</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given the root of a binary tree, invert the tree, and return its root.</p>
 *
 * @see <a href="https://leetcode.com/problems/invert-binary-tree/description/">226. Invert Binary Tree</a>
 */
public class InvertBinaryTreeSolution {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }

        return root;
    }
}
