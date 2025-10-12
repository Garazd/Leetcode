package com.leetcode.solution;

import com.leetcode.util.ListNode;

/**
 * <b>Reverse Nodes in k-Group</b>
 * <p>Level: <i>Hard</i></p>
 * <p>Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
 * k is a positive integer and is less than or equal to the length of the linked list.
 * If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
 * You may not alter the values in the list's nodes, only nodes themselves may be changed.</p>
 *
 * @see <a href="https://leetcode.com/problems/reverse-nodes-in-k-group/description/">25. Reverse Nodes in k-Group</a>
 */
public class ReverseNodesInKGroupSolution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }
        int count = 0;
        ListNode temp = head;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        if (count < k) {
            return head;
        }

        ListNode newHead = reverse(head, temp);
        head.next = reverseKGroup(temp, k);
        return newHead;
    }

    public ListNode reverse(ListNode start, ListNode end) {
        ListNode prev = null, curr = start;
        while (curr != end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
