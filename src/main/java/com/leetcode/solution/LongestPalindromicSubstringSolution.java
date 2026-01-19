package com.leetcode.solution;

/**
 * <b>Longest Palindromic Substring</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given a string s, return the longest palindromic substring in s.</p>
 *
 * @see <a href="https://leetcode.com/problems/longest-palindromic-substring/description/">5. Longest Palindromic Substring</a>
 */
public class LongestPalindromicSubstringSolution {
    public String longestPalindrome(String s) {
        if (s.contentEquals(new StringBuilder(s).reverse())) {
            return s;
        }

        String left = longestPalindrome(s.substring(1));
        String right = longestPalindrome(s.substring(0, s.length() - 1));

        if (left.length() > right.length()) {
            return left;
        } else {
            return right;
        }
    }
}
