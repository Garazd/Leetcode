package com.leetcode.solution;

import com.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Flatten Binary Tree to Linked List</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given the root of a binary tree, flatten the tree into a "linked list":
 * The "linked list" should use the same TreeNode class where the right child pointer points to the next node
 * in the list and the left child pointer is always null.
 * The "linked list" should be in the same order as a pre-order traversal of the binary tree.</p>
 *
 * @see <a href="https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/">114. Flatten Binary Tree to Linked List</a>
 */
public class FlattenBinaryTreeToLinkedListSolution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        List<TreeNode> nodes = new ArrayList<>();
        preorder(root, nodes);

        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).left = null;
            nodes.get(i).right = nodes.get(i + 1);
        }
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
