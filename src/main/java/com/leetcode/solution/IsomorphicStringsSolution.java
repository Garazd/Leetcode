package com.leetcode.solution;

/**
 * <b>Isomorphic Strings</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.</p>
 *
 * @see <a href="https://leetcode.com/problems/insert-delete-getrandom-o1/description/">205. Isomorphic Strings</a>
 */
public class IsomorphicStringsSolution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] map1 = new int[200];
        int[] map2 = new int[200];
        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                return false;
            }
            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
