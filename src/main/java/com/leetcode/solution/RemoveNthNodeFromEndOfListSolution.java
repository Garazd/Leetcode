package com.leetcode.solution;

import com.leetcode.util.ListNode;

/**
 * <b>Remove Nth Node From End of List</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given the head of a linked list, remove the nth node from the end of the list and return its head.</p>
 *
 * @see <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/">19. Remove Nth Node From End of List</a>
 */
public class RemoveNthNodeFromEndOfListSolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 1) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
