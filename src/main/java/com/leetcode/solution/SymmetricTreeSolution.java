package com.leetcode.solution;

import com.leetcode.util.TreeNode;

/**
 * <b>Symmetric Tree</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).</p>
 *
 * @see <a href="https://leetcode.com/problems/symmetric-tree/description/">101. Symmetric Tree</a>
 */
public class SymmetricTreeSolution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
