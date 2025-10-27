package com.leetcode.solution;

import com.leetcode.util.ListNode;

/**
 * <b>Rotate List</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given the head of a linked list, rotate the list to the right by k places.</p>
 *
 * @see <a href="https://leetcode.com/problems/rotate-list/description/">61. Rotate List</a>
 */
public class RotateListSolution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        tail.next = head;

        int stepsToNewTail = length - (k % length) - 1;

        ListNode newTail = head;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
