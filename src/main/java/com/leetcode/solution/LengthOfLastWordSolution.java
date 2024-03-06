package com.leetcode.solution;

/**
 * <b>Length of Last Word</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given a string s consisting of words and spaces, return the length of the last word in the string.</p>
 *
 * @see <a href="https://leetcode.com/problems/length-of-last-word/description/">58. Length of Last Word</a>
 */
public class LengthOfLastWordSolution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        final char[] charArray = s.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] != ' ') {
                count++;
            }
            if (charArray[i] == ' ' && count != 0) {
                break;
            }
        }
        return count;
    }
}
