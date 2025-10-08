package com.leetcode.solution;

import com.leetcode.util.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListCycleSolutionTest {
    private LinkedListCycleSolution solution;

    @BeforeEach
    void setUp() {
        solution = new LinkedListCycleSolution();
    }

    @Test
    void shouldReturnTrueWhenListHasCycle() {
        final ListNode node1 = new ListNode(3);
        final ListNode node2 = new ListNode(2);
        final ListNode node3 = new ListNode(0);
        final ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        final boolean result = solution.hasCycle(node1);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenListHasNoCycle() {
        final ListNode node1 = new ListNode(1);
        final ListNode node2 = new ListNode(2);
        final ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        final boolean result = solution.hasCycle(node1);

        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenHeadIsNull() {
        final boolean result = solution.hasCycle(null);

        assertFalse(result);
    }
}
