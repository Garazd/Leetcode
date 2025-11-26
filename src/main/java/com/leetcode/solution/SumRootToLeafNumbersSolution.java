package com.leetcode.solution;

import com.leetcode.util.TreeNode;

/**
 * <b>Sum Root to Leaf Numbers</b>
 * <p>Level: <i>Medium</i></p>
 *
 * <p>You are given the root of a binary tree containing digits from 0 to 9 only.
 * Each root-to-leaf path in the tree represents a number.
 * For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
 * Return the total sum of all root-to-leaf numbers.
 * Test cases are generated so that the answer will fit in a 32-bit integer.
 * A leaf node is a node with no children.</p>
 *
 * @see <a href="https://leetcode.com/problems/sum-root-to-leaf-numbers/description/">129. Sum Root to Leaf Numbers</a>
 */
public class SumRootToLeafNumbersSolution {
    int totalSum = 0;

    public int sumNumbers(TreeNode root) {
        hasPathSum(root, new StringBuilder());
        return totalSum;
    }

    public void hasPathSum(TreeNode root, StringBuilder string) {
        if (root == null) {
            return;
        }
        string.append(root.val);
        if (root.left == null && root.right == null) {
            totalSum += Integer.parseInt(string.toString());
            return;
        }
        hasPathSum(root.left, new StringBuilder(string.toString()));
        hasPathSum(root.right, new StringBuilder(string.toString()));
    }
}
