package com.leetcode.solution;

import com.leetcode.util.TreeNode;

import java.util.Stack;

/**
 * <b>Count Complete Tree Nodes</b>
 * <p>Level: <i>Hard</i></p>
 *
 * <p>Given the root of a complete binary tree, return the number of the nodes in the tree.
 * According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree,
 * and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 * Design an algorithm that runs in less than O(n) time complexity.</p>
 *
 * @see <a href="https://leetcode.com/problems/count-complete-tree-nodes/description/">222. Count Complete Tree Nodes</a>
 */
public class CountCompleteTreeNodesSolution {
    public int countNodes(TreeNode root) {
        int count = 0;
        if (root == null) {
            return count;
        }

        return count(root) + 1;
    }

    private int count(final TreeNode root) {
        int count = 0;
        if (root == null) {
            return count;
        }
        if (root.left != null) {
            count += count(root.left) + 1;
        }
        if (root.right != null) {
            count += count(root.right) + 1;
        }

        return count;
    }
}
