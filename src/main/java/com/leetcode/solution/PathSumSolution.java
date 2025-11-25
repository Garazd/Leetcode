package com.leetcode.solution;

import com.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
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
    List<Integer> list = new LinkedList<>();

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        sum(root, 0);
        return list.contains(targetSum);
    }

    private void sum(TreeNode node, int sum) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            sum(node.left, sum + node.val);
        }
        if (node.right != null) {
            sum(node.right, sum + node.val);
        }
        if (node.left == null && node.right == null) {
            list.add(sum + node.val);
        }
    }
}
