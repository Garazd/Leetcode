package com.leetcode.solution;

/**
 * <b>Reverse Integer</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).</p>
 *
 * @see <a href="https://leetcode.com/problems/reverse-integer/description/">7. Reverse Integer</a>
 */
public class ReverseIntegerSolution {
    public int reverse(int x) {
        boolean isNegative = x < 0;

        try {
            final int res = Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString());
            return isNegative ? -res : res;
        } catch (NumberFormatException exception) {
            return 0;
        }
    }
}
