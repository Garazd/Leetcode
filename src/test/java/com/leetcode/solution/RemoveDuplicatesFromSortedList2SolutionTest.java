package com.leetcode.solution;

import com.leetcode.util.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedList2SolutionTest {
    private RemoveDuplicatesFromSortedList2Solution solution;

    @BeforeEach
    void setUp() {
        solution = new RemoveDuplicatesFromSortedList2Solution();
    }

    @Test
    void shouldEqualsListNode() {
        final ListNode firstNode1 = new ListNode(1);
        final ListNode firstNode2 = new ListNode(2);
        final ListNode firstNode3 = new ListNode(3);
        final ListNode firstNode4 = new ListNode(3);
        final ListNode firstNode5 = new ListNode(4);
        final ListNode firstNode6 = new ListNode(4);
        final ListNode firstNode7 = new ListNode(5);
        firstNode1.next = firstNode2;
        firstNode2.next = firstNode3;
        firstNode3.next = firstNode4;
        firstNode4.next = firstNode5;
        firstNode5.next = firstNode6;
        firstNode6.next = firstNode7;
        firstNode7.next = null;

        final ListNode resultNode1 = new ListNode(1);
        final ListNode resultNode2 = new ListNode(2);
        final ListNode resultNode5 = new ListNode(5);
        resultNode1.next = resultNode2;
        resultNode2.next = resultNode5;
        resultNode5.next = null;

        final ListNode result = solution.deleteDuplicates(firstNode1);

        assertEquals(resultNode1, result);
    }

    @Test
    void shouldReturnEmptyListNode() {
        final ListNode firstNode1 = new ListNode(1);
        final ListNode firstNode2 = new ListNode(1);
        final ListNode firstNode3 = new ListNode(1);
        final ListNode firstNode4 = new ListNode(2);
        final ListNode firstNode5 = new ListNode(3);
        firstNode1.next = firstNode2;
        firstNode2.next = firstNode3;
        firstNode3.next = firstNode4;
        firstNode4.next = firstNode5;
        firstNode5.next = null;

        final ListNode resultNode2 = new ListNode(2);
        final ListNode resultNode3 = new ListNode(3);
        resultNode2.next = resultNode3;
        resultNode3.next = null;

        final ListNode result = solution.deleteDuplicates(firstNode1);

        assertEquals(resultNode2, result);
    }
}
