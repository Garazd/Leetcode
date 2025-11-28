package com.leetcode.solution;

import com.leetcode.util.TreeNode;

/**
 * <b>Binary Tree Maximum Path Sum</b>
 * <p>Level: <i>Hard</i></p>
 *
 * <p>A path in a binary tree is a sequence of nodes where each pair of adjacent nodes
 * in the sequence has an edge connecting them. A node can only appear in the sequence at most once.
 * Note that the path does not need to pass through the root.
 * The path sum of a path is the sum of the node's values in the path.
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.</p>
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-maximum-path-sum/description/">124. Binary Tree Maximum Path Sum</a>
 */
public class BinaryTreeMaximumPathSumSolution {
    int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        sumNode(root);
        return result;
    }

    public int sumNode(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = Math.max(sumNode(node.left), 0);
        int right = Math.max(sumNode(node.right), 0);

        int tempSum = node.val + left + right;

        result = Math.max(result, tempSum);

        return node.val + Math.max(left, right);
    }
}
