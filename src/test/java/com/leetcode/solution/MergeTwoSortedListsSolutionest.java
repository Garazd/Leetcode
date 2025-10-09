package com.leetcode.solution;

import com.leetcode.util.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsSolutionest {
    private MergeTwoSortedListsSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MergeTwoSortedListsSolution();
    }

    @Test
    void shouldEqualsListNode() {
        final ListNode firstNode1 = new ListNode(1);
        final ListNode firstNode2 = new ListNode(2);
        final ListNode firstNode3 = new ListNode(4);
        firstNode1.next = firstNode2;
        firstNode2.next = firstNode3;
        firstNode3.next = null;

        final ListNode secondNode1 = new ListNode(1);
        final ListNode secondNode2 = new ListNode(3);
        final ListNode secondNode3 = new ListNode(4);
        secondNode1.next = secondNode2;
        secondNode2.next = secondNode3;
        secondNode3.next = null;

        final ListNode resultNode1 = new ListNode(1);
        final ListNode resultNode2 = new ListNode(1);
        final ListNode resultNode3 = new ListNode(2);
        final ListNode resultNode4 = new ListNode(3);
        final ListNode resultNode5 = new ListNode(4);
        final ListNode resultNode6 = new ListNode(4);
        resultNode1.next = resultNode2;
        resultNode2.next = resultNode3;
        resultNode3.next = resultNode4;
        resultNode4.next = resultNode5;
        resultNode5.next = resultNode6;
        resultNode6.next = null;

        final ListNode result = solution.mergeTwoLists(firstNode1, secondNode1);

        assertEquals(resultNode1, result);
    }

    @Test
    void shouldReturnEmptyListNode() {
        final ListNode firstNode = null;

        final ListNode secondNode = null;

        final ListNode resultNode = null;

        final ListNode result = solution.mergeTwoLists(firstNode, secondNode);

        assertEquals(resultNode, result);
    }

    @Test
    void shouldReturnEqualsListNode() {
        final ListNode firstNode1 = null;

        final ListNode secondNode1 = new ListNode(0);
        secondNode1.next = null;

        final ListNode resultNode1 = new ListNode(0);
        resultNode1.next = null;

        final ListNode result = solution.mergeTwoLists(firstNode1, secondNode1);

        assertEquals(resultNode1, result);
    }
}
