package com.leetcode.solution;

/**
 * <b>Reverse Words in a String</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.</p>
 *
 * @see <a href="https://leetcode.com/problems/reverse-words-in-a-string/description/">151. Reverse Words in a String</a>
 */
public class ReverseWordsInStringSolution {
    public String reverseWords(String s) {
        if (s.isBlank()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        final String[] split = s.split(" ");
        for (int i = split.length - 1; i >= 0; i--) {
            if (!split[i].isBlank()) {
                result.append(split[i]).append(" ");
            }
        }
        return result.toString().trim();
    }
}
