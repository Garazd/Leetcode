package com.leetcode.solution;

import com.leetcode.util.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PopulatingNextRightPointersEachNode2SolutionTest {
    private PopulatingNextRightPointersEachNode2Solution solution;

    @BeforeEach
    void setUp() {
        solution = new PopulatingNextRightPointersEachNode2Solution();
    }

    @Test
    void shouldEqualsNode() {
        final Node firstNode1 = new Node(1);
        final Node firstNode2 = new Node(2);
        final Node firstNode3 = new Node(3);
        final Node firstNode4 = new Node(4);
        final Node firstNode5 = new Node(5);
        final Node firstNode7 = new Node(7);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = firstNode4;
        firstNode2.right = firstNode5;
        firstNode3.left = null;
        firstNode3.right = firstNode7;

        final Node secondNode1 = new Node(1);
        final Node secondNode2 = new Node(2);
        final Node secondNode3 = new Node(3);
        final Node secondNode4 = new Node(4);
        final Node secondNode5 = new Node(5);
        final Node secondNode7 = new Node(7);
        secondNode1.left = secondNode2;
        secondNode1.right = secondNode3;
        secondNode1.next = null;
        secondNode2.left = secondNode4;
        secondNode2.right = secondNode5;
        secondNode2.next = secondNode3;
        secondNode3.left = null;
        secondNode3.right = secondNode7;
        secondNode3.next = null;
        secondNode4.next = secondNode5;
        secondNode5.next = secondNode7;
        secondNode7.next = null;

        final Node result = solution.connect(firstNode1);

        assertEquals(secondNode1, result);
    }

    @Test
    void shouldReturnTheSameNode() {
        final Node firstNode1 = null;

        final Node secondNode1 = null;

        final Node result = solution.connect(firstNode1);

        assertEquals(secondNode1, result);
    }
}
