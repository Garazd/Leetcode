package com.leetcode.solution;

import com.leetcode.util.TreeNode;

/**
 * <b>Lowest Common Ancestor of a Binary Tree</b>
 * <p>Level: <i>Hard</i></p>
 *
 * <p>Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q
 * as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”</p>
 *
 * @see <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/">236. Lowest Common Ancestor of a Binary Tree</a>
 */
public class LowestCommonAncestorOfBinaryTreeSolution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }
}
