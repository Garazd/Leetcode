package com.leetcode.solution;

import com.leetcode.util.Node;

/**
 * <b>Populating Next Right Pointers in Each Node II</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given a binary tree
 * struct Node {
 * int val;
 * Node *left;
 * Node *right;
 * Node *next;
 * }
 * Populate each next pointer to point to its next right node. If there is no next right node,
 * the next pointer should be set to NULL.
 * Initially, all next pointers are set to NULL.</p>
 *
 * @see <a href="https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/">117. Populating Next Right Pointers in Each Node II</a>
 */
public class PopulatingNextRightPointersEachNode2Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node curr = root;

        while (curr != null) {
            Node dummy = new Node(-1);
            Node tail = dummy;

            while (curr != null) {
                if (curr.left != null) {
                    tail.next = curr.left;
                    tail = tail.next;
                }
                if (curr.right != null) {
                    tail.next = curr.right;
                    tail = tail.next;
                }
                curr = curr.next;
            }

            curr = dummy.next;
        }

        return root;
    }
}
