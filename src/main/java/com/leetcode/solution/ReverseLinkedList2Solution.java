package com.leetcode.solution;

import com.leetcode.util.ListNode;

/**
 * <b>Reverse Linked List II</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given the head of a singly linked list and two integers left and right where left <= right,
 * reverse the nodes of the list from position left to position right, and return the reversed list.</p>
 *
 * @see <a href="https://leetcode.com/problems/reverse-linked-list-ii/description/">92. Reverse Linked List II</a>
 */
public class ReverseLinkedList2Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode reverse = new ListNode(-1);
        reverse.next = head;
        ListNode prev = reverse;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        for (int i = 0; i < right - left; i++) {
            ListNode forw = curr.next;
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }

        return reverse.next;
    }
}
