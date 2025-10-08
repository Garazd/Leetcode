package com.leetcode.solution;

import com.leetcode.util.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersSolutionTest {
    private AddTwoNumbersSolution solution;

    @BeforeEach
    void setUp() {
        solution = new AddTwoNumbersSolution();
    }

    @Test
    void shouldEqualsListNode() {
        final ListNode firstNode1 = new ListNode(2);
        final ListNode firstNode2 = new ListNode(4);
        final ListNode firstNode3 = new ListNode(3);
        firstNode1.next = firstNode2;
        firstNode2.next = firstNode3;
        firstNode3.next = null;

        final ListNode secondNode1 = new ListNode(5);
        final ListNode secondNode2 = new ListNode(6);
        final ListNode secondNode3 = new ListNode(4);
        secondNode1.next = secondNode2;
        secondNode2.next = secondNode3;
        secondNode3.next = null;

        final ListNode resultNode1 = new ListNode(7);
        final ListNode resultNode2 = new ListNode(0);
        final ListNode resultNode3 = new ListNode(8);
        resultNode1.next = resultNode2;
        resultNode2.next = resultNode3;
        resultNode3.next = null;

        final ListNode result = solution.addTwoNumbers(firstNode1, secondNode1);

        assertEquals(resultNode1, result);
    }

    @Test
    void shouldReturnTheSameListNode() {
        final ListNode firstNode = new ListNode(0);
        firstNode.next = null;

        final ListNode secondNode = new ListNode(0);
        secondNode.next = null;

        final ListNode resultNode = new ListNode(0);
        resultNode.next = null;

        final ListNode result = solution.addTwoNumbers(firstNode, secondNode);

        assertEquals(resultNode, result);
    }

    @Test
    void shouldReturnEqualsListNode() {
        final ListNode firstNode1 = new ListNode(9);
        final ListNode firstNode2 = new ListNode(9);
        final ListNode firstNode3 = new ListNode(9);
        final ListNode firstNode4 = new ListNode(9);
        final ListNode firstNode5 = new ListNode(9);
        final ListNode firstNode6 = new ListNode(9);
        final ListNode firstNode7 = new ListNode(9);
        firstNode1.next = firstNode2;
        firstNode2.next = firstNode3;
        firstNode3.next = firstNode4;
        firstNode4.next = firstNode5;
        firstNode5.next = firstNode6;
        firstNode6.next = firstNode7;
        firstNode7.next = null;

        final ListNode secondNode1 = new ListNode(9);
        final ListNode secondNode2 = new ListNode(9);
        final ListNode secondNode3 = new ListNode(9);
        final ListNode secondNode4 = new ListNode(9);
        secondNode1.next = secondNode2;
        secondNode2.next = secondNode3;
        secondNode3.next = secondNode4;
        secondNode4.next = null;

        final ListNode resultNode1 = new ListNode(8);
        final ListNode resultNode2 = new ListNode(9);
        final ListNode resultNode3 = new ListNode(9);
        final ListNode resultNode4 = new ListNode(9);
        final ListNode resultNode5 = new ListNode(0);
        final ListNode resultNode6 = new ListNode(0);
        final ListNode resultNode7 = new ListNode(0);
        final ListNode resultNode8 = new ListNode(1);
        resultNode1.next = resultNode2;
        resultNode2.next = resultNode3;
        resultNode3.next = resultNode4;
        resultNode4.next = resultNode5;
        resultNode5.next = resultNode6;
        resultNode6.next = resultNode7;
        resultNode7.next = resultNode8;
        resultNode8.next = null;

        final ListNode result = solution.addTwoNumbers(firstNode1, secondNode1);

        assertEquals(resultNode1, result);
    }
}
