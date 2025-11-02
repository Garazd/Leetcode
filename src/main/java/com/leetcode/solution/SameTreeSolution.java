package com.leetcode.solution;

import com.leetcode.util.TreeNode;

/**
 * <b>Same Tree</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.</p>
 *
 * @see <a href="https://leetcode.com/problems/same-tree/description/">100. Same Tree</a>
 */
public class SameTreeSolution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result;
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null && p.val == q.val) {
            result = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            result = false;
        }

        return result;
    }
}
