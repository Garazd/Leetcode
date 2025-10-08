package com.leetcode.solution;

import com.leetcode.util.ListNode;

import java.math.BigInteger;

/**
 * <b>Add Two Numbers</b>
 * <p>Level: <i>Medium</i></p>
 * <p>You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.</p>
 *
 * @see <a href="https://leetcode.com/problems/add-two-numbers/description/">2. Add Two Numbers</a>
 */
public class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder first = new StringBuilder();
        for (int i = 0; l1 != null; i++) {
            first.append(l1.val);
            l1 = l1.next;
        }
        final BigInteger firstNumber = new BigInteger(first.reverse().toString());

        StringBuilder second = new StringBuilder();
        for (int i = 0; l2 != null; i++) {
            second.append(l2.val);
            l2 = l2.next;
        }
        final BigInteger secondNumber = new BigInteger(second.reverse().toString());

        final BigInteger resultNumber = firstNumber.add(secondNumber);
        final String resultString = String.valueOf(resultNumber);
        final char[] charArray = new StringBuilder(resultString).reverse().toString().toCharArray();

        final ListNode resultNode = new ListNode(charArray[0] - '0');
        ListNode current = resultNode;

        for (int i = 1; i < charArray.length; i++) {
            final int integer = charArray[i] - '0';
            current.next = new ListNode(integer);
            current = current.next;
        }

        return resultNode;
    }
}
