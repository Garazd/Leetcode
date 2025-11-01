package com.leetcode.solution;

import com.leetcode.util.TreeNode;

/**
 * <b>Maximum Depth of Binary Tree</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.</p>
 *
 * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/description/">104. Maximum Depth of Binary Tree</a>
 */
public class MaximumDepthOfBinaryTreeSolution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxDepthLeft = maxDepth(root.left);
        int maxDepthRight = maxDepth(root.right);
        return Math.max(maxDepthLeft, maxDepthRight) + 1;
    }
}
