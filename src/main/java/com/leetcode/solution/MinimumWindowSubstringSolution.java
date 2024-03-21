package com.leetcode.solution;

/**
 * <b>Minimum Window Substring</b>
 * <p>Level: <i>Hard</i></p>
 * <p>Given two strings s and t of lengths m and n respectively, return the minimum window substring
 * of s such that every character in t (including duplicates) is included in the window.
 * If there is no such substring, return the empty string "".</p>
 *
 * @see <a href="https://leetcode.com/problems/minimum-window-substring/description/">76. Minimum Window Substring</a>
 */
public class MinimumWindowSubstringSolution {
    public String minWindow(String s, String t) {
        if (s.isBlank() || t.isBlank() || t.length() > s.length()) {
            return "";
        }
        int[] map = new int[123];
        int left = 0, right = 0, count = t.length(), sub_len = Integer.MAX_VALUE, start = 0;

        for (char c : t.toCharArray()) {
            map[c]++;
        }

        char[] ch = s.toCharArray();
        while (right < s.length()) {
            if (map[ch[right++]]-- > 0) {
                count--;
            }

            while (count == 0) {
                if ((right - left) < sub_len) {
                    sub_len = right - (start = left);
                }
                if (map[ch[left++]]++ == 0) {
                    count++;
                }
            }
        }
        return sub_len == Integer.MAX_VALUE ? "" : s.substring(start, start + sub_len);
    }
}
