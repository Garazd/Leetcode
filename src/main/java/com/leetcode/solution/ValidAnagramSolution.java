package com.leetcode.solution;

/**
 * <b>Valid Anagram</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given two strings s and t, return true if t is an anagram of s, and false otherwise.</p>
 *
 * @see <a href="https://leetcode.com/problems/valid-anagram/description/">242. Valid Anagram</a>
 */
public class ValidAnagramSolution {
    public boolean isAnagram(String string, String anagram) {
        if (string.length() != anagram.length()) {
            return false;
        }

        final char[] anagramCharArray = anagram.toCharArray();
        final char[] stringCharArray = string.toCharArray();
        int count = 0;
        for (int i = 0; i < anagramCharArray.length; i++) {
            for (int j = 0; j < stringCharArray.length; j++) {
                if (anagramCharArray[i] == stringCharArray[j]) {
                    anagramCharArray[i] = '+';
                    stringCharArray[j] = '+';
                    count++;
                    break;
                }
            }
        }
        return count == anagramCharArray.length;
    }
}
