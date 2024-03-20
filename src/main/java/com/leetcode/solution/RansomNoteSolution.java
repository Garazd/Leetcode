package com.leetcode.solution;

/**
 * <b>Ransom Note</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters
 * from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.</p>
 *
 * @see <a href="https://leetcode.com/problems/minimum-size-subarray-sum/description/">383. Ransom Note</a>
 */
public class RansomNoteSolution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[128];
        if (magazine.length() < ransomNote.length() || ransomNote.isBlank() || magazine.isBlank()) {
            return false;
        }
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--count[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
