package com.leetcode.solution;

/**
 * <b>Longest Common Prefix</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".</p>
 *
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/description/">14. Longest Common Prefix</a>
 */
public class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (String s : strs)
            while (s.indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
            }
        return result;
    }
}
