package com.leetcode.solution;

import com.leetcode.util.ListNode;

/**
 * <b>Partition List</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given the head of a linked list and a value x, partition it such that all nodes less than x
 * come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.</p>
 *
 * @see <a href="https://leetcode.com/problems/partition-list/description/">86. Partition List</a>
 */
public class PartitionListSolution {
    public ListNode partition(ListNode head, int x) {
        ListNode sList = new ListNode();
        ListNode bList = new ListNode();
        ListNode small = sList;
        ListNode big = bList;

        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }

        small.next = bList.next;
        big.next = null;

        return sList.next;
    }
}
