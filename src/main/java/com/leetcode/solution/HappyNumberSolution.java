package com.leetcode.solution;

/**
 * <b>Happy Number</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Write an algorithm to determine if a number n is happy.
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.</p>
 *
 * @see <a href="https://leetcode.com/problems/happy-number/description/">202. Happy Number</a>
 */
public class HappyNumberSolution {
    public boolean isHappy(int num) {
        if (num == 4) {
            return false;
        }

        if (num == 1) {
            return true;
        }

        int sum = num;
        final String string = String.valueOf(sum);
        sum = 0;
        final char[] charArray = string.toCharArray();
        for (final char ch : charArray) {
            final int integer = Integer.parseInt(String.valueOf(ch));
            sum += integer * integer;
        }

        if (sum == 1) {
            return true;
        } else {
            return isHappy(sum);
        }
    }
}
