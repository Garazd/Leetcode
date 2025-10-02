package com.leetcode.solution;

import java.util.Comparator;
import java.util.Stack;

/**
 * <b>Min Stack</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * Implement the MinStack class:
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.</p>
 * <p>
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 *
 * @see <a href="https://leetcode.com/problems/min-stack/description/">155. Min Stack</a>
 */
public class MinStackSolution {

    private final Stack<Integer> stack = new Stack<>();

    public MinStackSolution() {
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack.stream()
                .min(Comparator.naturalOrder())
                .orElse(0);
    }
}
