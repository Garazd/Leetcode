package com.leetcode.solution;

import com.leetcode.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeRightSideViewSolutionTest {
    private BinaryTreeRightSideViewSolution solution;

    @BeforeEach
    void setUp() {
        solution = new BinaryTreeRightSideViewSolution();
    }

    @Test
    void shouldReturnRightSideView() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        final TreeNode firstNode3 = new TreeNode(3);
        final TreeNode firstNode4 = new TreeNode(4);
        final TreeNode firstNode5 = new TreeNode(5);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = firstNode5;
        firstNode3.left = firstNode4;

        final List<Integer> result = solution.rightSideView(firstNode1);

        assertEquals(List.of(1, 3, 4), result);
    }

    @Test
    void shouldReturnRightSide() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode2 = new TreeNode(2);
        final TreeNode firstNode3 = new TreeNode(3);
        final TreeNode firstNode4 = new TreeNode(4);
        final TreeNode firstNode5 = new TreeNode(5);
        firstNode1.left = firstNode2;
        firstNode1.right = firstNode3;
        firstNode2.left = firstNode4;
        firstNode4.left = firstNode5;

        final List<Integer> result = solution.rightSideView(firstNode1);

        assertEquals(List.of(1, 3, 4, 5), result);
    }

    @Test
    void shouldReturnRight() {
        final TreeNode firstNode1 = new TreeNode(1);
        final TreeNode firstNode3 = new TreeNode(3);
        firstNode1.right = firstNode3;

        final List<Integer> result = solution.rightSideView(firstNode1);

        assertEquals(List.of(1, 3), result);
    }

    @Test
    void shouldReturnEmptyRight() {
        final TreeNode firstNode1 = null;

        final List<Integer> result = solution.rightSideView(firstNode1);

        assertEquals(List.of(), result);
    }
}
