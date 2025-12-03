package com.leetcode.solution;

import com.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Binary Tree Right Side View</b>
 * <p>Level: <i>Medium</i></p>
 *
 * <p>Given the root of a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.”</p>
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-right-side-view/description/">199. Binary Tree Right Side View</a>
 */
public class BinaryTreeRightSideViewSolution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightView(root, result, 0);
        return result;
    }

    public void rightView(TreeNode curr, List<Integer> result, int currDepth) {
        if (curr == null) {
            return;
        }

        if (currDepth == result.size()) {
            result.add(curr.val);
        }

        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
    }
}
