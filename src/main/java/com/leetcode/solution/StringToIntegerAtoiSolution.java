package com.leetcode.solution;

/**
 * <b>String to Integer (atoi)</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
 * The algorithm for myAtoi(string s) is as follows:
 * Whitespace: Ignore any leading whitespace (" ").
 * Signedness: Determine the sign by checking if the next character is '-' or '+',
 * assuming positivity if neither present.
 * Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered
 * or the end of the string is reached. If no digits were read, then the result is 0.
 * Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
 * then round the integer to remain in the range. Specifically,
 * integers less than -231 should be rounded to -231,
 * and integers greater than 231 - 1 should be rounded to 231 - 1.
 * Return the integer as the final result.</p>
 *
 * @see <a href="https://leetcode.com/problems/string-to-integer-atoi/description/">8. String to Integer (atoi)</a>
 */
public class StringToIntegerAtoiSolution {
    public int myAtoi(String s) {
        String trim = s.trim();
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        int length = trim.length();
        int i = 0;

        if (trim.isBlank()) {
            return 0;
        }

        int sign = 1;
        if (trim.charAt(i) == '+') {
            i++;
        } else if (trim.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        long res = 0;
        while (i < length && Character.isDigit(trim.charAt(i))) {
            int digit = trim.charAt(i) - '0';
            res = res * 10 + digit;

            if (sign * res <= INT_MIN) {
                return INT_MIN;
            }
            if (sign * res >= INT_MAX) {
                return INT_MAX;
            }
            i++;
        }

        return (int)(res * sign);
    }
}
