package com.leetcode.solution;

/**
 * <b>Valid Palindrome</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given a string s, return true if it is a palindrome, or false otherwise.</p>
 *
 * @see <a href="https://leetcode.com/problems/valid-palindrome/description/">125. Valid Palindrome</a>
 */
public class ValidPalindromeSolution {
    public boolean isPalindrome(String s) {
        boolean result = true;
        if (s.length() <= 1) {
            return result;
        }
        String newStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = newStr.length() - 1;
        char[] charArray = newStr.toCharArray();
        while (left < right) {
            if (!(charArray[left] == charArray[right])) {
                return false;
            }
            left++;
            right--;
        }
        return result;
    }
}
