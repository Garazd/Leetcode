package com.leetcode.solution;

import com.leetcode.util.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CopyListWithRandomPointerSolutionTest {
    private CopyListWithRandomPointerSolution solution;

    @BeforeEach
    void setUp() {
        solution = new CopyListWithRandomPointerSolution();
    }

    @Test
    void shouldEqualsNode() {
        final Node firstNode1 = new Node(7);
        final Node firstNode2 = new Node(13);
        final Node firstNode3 = new Node(11);
        final Node firstNode4 = new Node(10);
        final Node firstNode5 = new Node(1);
        firstNode1.next = firstNode2;
        firstNode2.next = firstNode3;
        firstNode3.next = firstNode4;
        firstNode4.next = firstNode5;
        firstNode5.next = null;
        firstNode1.random = null;
        firstNode2.random = firstNode1;
        firstNode3.random = firstNode5;
        firstNode4.random = firstNode2;
        firstNode5.random = firstNode1;

        final Node secondNode1 = new Node(7);
        final Node secondNode2 = new Node(13);
        final Node secondNode3 = new Node(11);
        final Node secondNode4 = new Node(10);
        final Node secondNode5 = new Node(1);
        secondNode1.next = secondNode2;
        secondNode2.next = secondNode3;
        secondNode3.next = secondNode4;
        secondNode4.next = secondNode5;
        secondNode5.next = null;
        secondNode1.random = null;
        secondNode2.random = secondNode1;
        secondNode3.random = secondNode5;
        secondNode4.random = secondNode2;
        secondNode5.random = secondNode1;

        final Node result = solution.copyRandomList(firstNode1);

        assertEquals(secondNode1, result);
    }

    @Test
    void shouldReturnTheSameNode() {
        final Node firstNode1 = new Node(1);
        final Node firstNode2 = new Node(2);
        firstNode1.next = firstNode2;
        firstNode1.random = firstNode2;
        firstNode2.next = null;
        firstNode2.random = firstNode2;

        final Node secondNode1 = new Node(1);
        final Node secondNode2 = new Node(2);
        secondNode1.next = secondNode2;
        secondNode1.random = secondNode2;
        secondNode2.next = null;
        secondNode2.random = secondNode2;

        final Node result = solution.copyRandomList(firstNode1);

        assertEquals(secondNode1, result);
    }

    @Test
    void shouldReturnEqualsNode() {
        final Node firstNode1 = new Node(3);
        final Node firstNode2 = new Node(3);
        final Node firstNode3 = new Node(3);
        firstNode1.next = firstNode2;
        firstNode2.next = firstNode3;
        firstNode3.next = null;
        firstNode1.random = null;
        firstNode2.random = firstNode1;
        firstNode3.random = null;

        final Node secondNode1 = new Node(3);
        final Node secondNode2 = new Node(3);
        final Node secondNode3 = new Node(3);
        secondNode1.next = secondNode2;
        secondNode2.next = secondNode3;
        secondNode3.next = null;
        secondNode1.random = null;
        secondNode2.random = secondNode1;
        secondNode3.random = null;

        final Node result = solution.copyRandomList(firstNode1);

        assertEquals(secondNode1, result);
    }
}
