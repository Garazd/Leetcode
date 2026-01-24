package com.leetcode.solution;

/**
 * <b>Regular Expression Matching</b>
 * <p>Level: <i>Hard</i></p>
 * <p>Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).</p>
 *
 * @see <a href="https://leetcode.com/problems/regular-expression-matching/description/">10. Regular Expression Matching</a>
 */
public class RegularExpressionMatchingSolution {
    public boolean isMatch(String s, String p) {
        return match(s, p, 0, 0);
    }

    private boolean match(String s, String p, int sIndex, int pIndex) {
        if (sIndex == s.length() && pIndex == p.length()) {
            return true;
        }

        if (pIndex == p.length()) {
            return false;
        }

        char currentChar = p.charAt(pIndex);
        boolean hasStar = (pIndex + 1 < p.length() && p.charAt(pIndex + 1) == '*');

        if (hasStar) {
            if (match(s, p, sIndex, pIndex + 2)) {
                return true;
            }

            int i = sIndex;
            while (i < s.length() && (currentChar == '.' || s.charAt(i) == currentChar)) {
                if (match(s, p, i + 1, pIndex + 2)) {
                    return true;
                }
                i++;
            }
        } else {
            if (sIndex < s.length() && (currentChar == '.' || s.charAt(sIndex) == currentChar)) {
                return match(s, p, sIndex + 1, pIndex + 1);
            }
        }
        return false;
    }
}
