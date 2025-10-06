package com.leetcode.solution;

/**
 * <b>Basic Calculator</b>
 * <p>Level: <i>Hard</i></p>
 * <p>Given a string s representing a valid expression, implement a basic calculator to evaluate it,
 * and return the result of the evaluation.
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions,
 * such as eval().</p>
 *
 * @see <a href="https://leetcode.com/problems/basic-calculator/description/">224. Basic Calculator</a>
 */
public class BasicCalculatorSolution {
    int i = 0;

    public int calculate(String s) {
        return calc(s);
    }

    private int calc(String s) {
        int num = 0, ans = 0, sign = 1;
        while (i < s.length()) {
            char c = s.charAt(i++);
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            } else if (c == '(') {
                num = calc(s);
            } else if (c == ')') {
                return ans += num * sign;
            } else if (c == '+' || c == '-') {
                ans += num * sign;
                num = 0;
                sign = c == '+' ? 1 : -1;
            }
        }
        ans += num * sign;
        return ans;
    }
}
