package com.leetcode.solution;

import java.util.Arrays;

/**
 * <b>Longest Consecutive Sequence</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.</p>
 *
 * @see <a href="https://leetcode.com/problems/longest-consecutive-sequence/description/">128. Longest Consecutive Sequence</a>
 */
public class LongestConsecutiveSequenceSolution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int count = 1;
        int max = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }

        return max;
    }
}
