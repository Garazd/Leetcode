package com.leetcode.solution;

import com.leetcode.util.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateListSolutionTest {
    private RotateListSolution solution;

    @BeforeEach
    void setUp() {
        solution = new RotateListSolution();
    }

    @Test
    void shouldEqualsListNode() {
        final ListNode firstNode1 = new ListNode(1);
        final ListNode firstNode2 = new ListNode(2);
        final ListNode firstNode3 = new ListNode(3);
        final ListNode firstNode4 = new ListNode(4);
        final ListNode firstNode5 = new ListNode(5);
        firstNode1.next = firstNode2;
        firstNode2.next = firstNode3;
        firstNode3.next = firstNode4;
        firstNode4.next = firstNode5;
        firstNode5.next = null;

        final ListNode resultNode1 = new ListNode(4);
        final ListNode resultNode2 = new ListNode(5);
        final ListNode resultNode3 = new ListNode(1);
        final ListNode resultNode4 = new ListNode(2);
        final ListNode resultNode5 = new ListNode(3);
        resultNode1.next = resultNode2;
        resultNode2.next = resultNode3;
        resultNode3.next = resultNode4;
        resultNode4.next = resultNode5;
        resultNode5.next = null;

        final ListNode result = solution.rotateRight(firstNode1, 2);

        assertEquals(resultNode1, result);
    }

    @Test
    void shouldReturnListNode() {
        final ListNode firstNode1 = new ListNode(0);
        final ListNode firstNode2 = new ListNode(1);
        final ListNode firstNode3 = new ListNode(2);
        firstNode1.next = firstNode2;
        firstNode2.next = firstNode3;
        firstNode3.next = null;

        final ListNode resultNode1 = new ListNode(2);
        final ListNode resultNode2 = new ListNode(0);
        final ListNode resultNode3 = new ListNode(1);
        resultNode1.next = resultNode2;
        resultNode2.next = resultNode3;
        resultNode3.next = null;

        final ListNode result = solution.rotateRight(firstNode1, 4);

        assertEquals(resultNode1, result);
    }

    @Test
    void shouldReturnEqualsListNode() {
        final ListNode firstNode1 = new ListNode(0);
        final ListNode firstNode2 = new ListNode(1);
        firstNode1.next = firstNode2;
        firstNode2.next = null;

        final ListNode resultNode1 = new ListNode(1);
        final ListNode resultNode2 = new ListNode(0);
        resultNode1.next = resultNode2;
        resultNode2.next = null;

        final ListNode result = solution.rotateRight(firstNode1, 1);

        assertEquals(resultNode1, result);
    }
}
