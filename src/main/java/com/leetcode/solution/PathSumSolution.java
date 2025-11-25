package com.leetcode.solution;

import com.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Path Sum</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals targetSum.
 * A leaf is a node with no children.</p>
 *
 * @see <a href="https://leetcode.com/problems/path-sum/description/">112. Path Sum</a>
 */
public class PathSumSolution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return false;
    }

    private void preorder(TreeNode node, List<TreeNode> nodes) {
        if (node == null) {
            return;
        }
        nodes.add(node);
        preorder(node.left, nodes);
        preorder(node.right, nodes);
    }
}
