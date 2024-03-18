package com.leetcode.solution;

/**
 * <b>Longest Substring Without Repeating Characters</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given a string s, find the length of the longest substring without repeating characters.</p>
 *
 * @see <a href="https://leetcode.com/problems/minimum-size-subarray-sum/description/">3. Longest Substring Without Repeating Characters</a>
 */
public class LongestSubstringWithoutRepeatingCharactersSolution {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            left = Math.max(left, chars[s.charAt(i)]);
            max = Math.max(max, i - left + 1);
            chars[s.charAt(i)] = i + 1;
        }
        return max;
    }
}
