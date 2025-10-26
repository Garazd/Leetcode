package com.leetcode.solution;

import com.leetcode.util.ListNode;

/**
 * <b>Remove Duplicates from Sorted List II</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list. Return the linked list sorted as well.</p>
 *
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/">82. Remove Duplicates from Sorted List II</a>
 */
public class RemoveDuplicatesFromSortedList2Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            boolean isDuplicate = false;
            while (current.next != null && current.val == current.next.val) {
                current = current.next;
                isDuplicate = true;
            }
            if (isDuplicate) {
                prev.next = current.next;
            } else {
                prev = prev.next;
            }
            current = current.next;
        }

        return dummy.next;
    }
}
