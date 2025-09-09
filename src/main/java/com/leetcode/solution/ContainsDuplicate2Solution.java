package com.leetcode.solution;

import java.util.HashSet;

/**
 * <b>Contains Duplicate II</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given an integer array nums and an integer k, return true if there are two distinct indices i and j
 * in the array such that nums[i] == nums[j] and abs(i - j) <= k.</p>
 *
 * @see <a href="https://leetcode.com/problems/contains-duplicate-ii/">219. Contains Duplicate II</a>
 */
public class ContainsDuplicate2Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2 || k == 0) {
            return false;
        }

        int i = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (final int num : nums) {
            if (!hashSet.add(num)) {
                return true;
            }
            if (hashSet.size() >= k + 1) {
                hashSet.remove(nums[i++]);
            }
        }
        return false;
    }
}
