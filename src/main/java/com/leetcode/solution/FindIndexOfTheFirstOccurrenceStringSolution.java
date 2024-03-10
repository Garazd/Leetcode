package com.leetcode.solution;

/**
 * <b>Find the Index of the First Occurrence in a String</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.</p>
 *
 * @see <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/">28. Find the Index of the First Occurrence in a String</a>
 */
public class FindIndexOfTheFirstOccurrenceStringSolution {
    public int strStr(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
