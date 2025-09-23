package com.leetcode.solution;

import java.util.Stack;

/**
 * <b>Valid Parentheses</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.</p>
 *
 * @see <a href="https://leetcode.com/problems/valid-parentheses/description/">20. Valid Parentheses</a>
 */
public class ValidParenthesesSolution {
    public boolean isValid(String string) {
        if (string.isBlank()) {
            return true;
        }
        if (string.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        final char[] charArray = string.toCharArray();
        for (final char current : charArray) {
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } else {
                if (stack.empty()) {
                    return false;
                }
                final Character top = stack.peek();
                if (current == ')') {
                    if (top == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (current == '}') {
                    if (top == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (current == ']') {
                    if (top == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}
