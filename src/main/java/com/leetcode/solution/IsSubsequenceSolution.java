package com.leetcode.solution;

/**
 * <b>Is Subsequence</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given two strings s and t, return true if s is a subsequence of t, or false otherwise.</p>
 *
 * @see <a href="https://leetcode.com/problems/is-subsequence/description/">392. Is Subsequence</a>
 */
public class IsSubsequenceSolution {
    public boolean isSubsequence(String s, String t) {
        if (s.isBlank()) {
            return true;
        }
        int first = 0;
        int second = 0;
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        while (second < t.length() && first < s.length()) {
            if (charArrayT[second] == charArrayS[first]) {
                first++;
            }
            second++;
        }
        return first == s.length();
    }
}
