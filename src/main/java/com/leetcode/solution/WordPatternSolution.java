package com.leetcode.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <b>Valid Palindrome</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter
 * in pattern and a non-empty word in s.
 * Specifically:
 * Each letter in pattern maps to exactly one unique word in s.
 * Each unique word in s maps to exactly one letter in pattern.
 * No two letters map to the same word, and no two words map to the same letter.</p>
 *
 * @see <a href="https://leetcode.com/problems/word-pattern/description/">290. Word Pattern</a>
 */
public class WordPatternSolution {
    public boolean wordPattern(String pattern, String string) {
        final char[] charArray = pattern.toCharArray();
        final String[] words = string.split(" ");
        Map<Character, String> result = new HashMap<>();

        if (charArray.length != words.length) {
            return false;
        }

        for (int i = 0; i < charArray.length; i++) {
            if (result.containsKey(charArray[i])) {
                final String word = result.get(charArray[i]);
                if (!Objects.equals(word, words[i])) {
                    return false;
                }
            } else if (result.containsValue(words[i])) {
                return false;
            } else {
                result.put(charArray[i], words[i]);
            }
        }
        return true;
    }
}
