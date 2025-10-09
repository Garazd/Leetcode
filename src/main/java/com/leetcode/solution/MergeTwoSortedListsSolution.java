package com.leetcode.solution;

import com.leetcode.util.ListNode;

/**
 * <b>Merge Two Sorted Lists</b>
 * <p>Level: <i>Easy</i></p>
 * <p>You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.</p>
 *
 * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists/description/">21. Merge Two Sorted Lists</a>
 */
public class MergeTwoSortedListsSolution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(-1);
        ListNode temp = merged;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                temp.next = new ListNode(list2.val);
                temp = temp.next;
                list2 = list2.next;
            } else if (list2 == null) {
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1 = list1.next;
            } else if (list1.val == list2.val) {
                temp.next = new ListNode(list1.val, new ListNode(list2.val));
                temp = temp.next.next;
                list1 = list1.next;
                list2 = list2.next;
            } else if (list1.val < list2.val) {
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = new ListNode(list2.val);
                temp = temp.next;
                list2 = list2.next;
            }
        }

        return merged.next;
    }
}
