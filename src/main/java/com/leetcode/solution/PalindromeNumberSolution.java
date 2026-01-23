package com.leetcode.solution;

/**
 * <b>Palindrome Number</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given an integer x, return true if x is a palindrome, and false otherwise.</p>
 *
 * @see <a href="https://leetcode.com/problems/palindrome-number/description/">9. Palindrome Number</a>
 */
public class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        final String string = String.valueOf(x);
        final String rev = new StringBuffer(string).reverse().toString();
        return string.equals(rev);
    }
}
