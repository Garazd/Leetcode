package com.leetcode.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <b>Substring with Concatenation of All Words</b>
 * <p>Level: <i>Hard</i></p>
 * <p>You are given a string s and an array of strings words. All the strings of words are of the same length.
 * A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.
 * Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.</p>
 *
 * @see <a href="https://leetcode.com/problems/minimum-size-subarray-sum/description/">30. Substring with Concatenation of All Words</a>
 */
public class SubstringWithConcatenationOfAllWordsSolution {
    public List<Integer> findSubstring(String s, String[] words) {
        if (s == null || words == null || s.isEmpty() || words.length == 0) {
            return new ArrayList<>();
        }
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        int wordLength = words[0].length();
        int sum = wordLength * words.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length() - sum + 1; i++) {
            String w = s.substring(i, i + sum);
            if (isConcat(w, counts, wordLength)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isConcat(String w, Map<String, Integer> counts, int wordLength) {
        Map<String, Integer> seen = new HashMap<>();
        for (int i = 0; i + wordLength <= w.length(); ) {
            String sub = w.substring(i, i + wordLength);
            seen.put(sub, seen.getOrDefault(sub, 0) + 1);
            i += wordLength;
        }
        return counts.equals(seen);
    }
}
