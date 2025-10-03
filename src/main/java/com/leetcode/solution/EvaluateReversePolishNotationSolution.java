package com.leetcode.solution;

import java.util.Stack;

/**
 * <b>Evaluate Reverse Polish Notation</b>
 * <p>Level: <i>Medium</i></p>
 * <p>You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
 * Evaluate the expression. Return an integer that represents the value of the expression.
 * Note that:
 * The valid operators are '+', '-', '*', and '/'.
 * Each operand may be an integer or another expression.
 * The division between two integers always truncates toward zero.
 * There will not be any division by zero.
 * The input represents a valid arithmetic expression in a reverse polish notation.
 * The answer and all the intermediate calculations can be represented in a 32-bit integer.</p>
 *
 * @see <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/description/">150. Evaluate Reverse Polish Notation</a>
 */
public class EvaluateReversePolishNotationSolution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (final String token : tokens) {
            switch (token) {
                case "+" -> {
                    final int plus = stack.pop() + stack.pop();
                    stack.push(plus);
                }
                case "-" -> {
                    final int first = stack.pop();
                    final int minus = stack.pop() - first;
                    stack.push(minus);
                }
                case "*" -> {
                    final int multiply = stack.pop() * stack.pop();
                    stack.push(multiply);
                }
                case "/" -> {
                    final int first = stack.pop();
                    int divide = stack.pop() / first;
                    stack.push(divide);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
