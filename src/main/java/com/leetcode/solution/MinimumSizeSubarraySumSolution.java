package com.leetcode.solution;

/**
 * <b>Minimum Size Subarray Sum</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
 * whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.</p>
 *
 * @see <a href="https://leetcode.com/problems/minimum-size-subarray-sum/description/">209. Minimum Size Subarray Sum</a>
 */
public class MinimumSizeSubarraySumSolution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum = sum + nums[j];
            if (sum < target) {
                j++;
            } else if (sum == target) {
                res = Math.min(res, j - i + 1);
                j++;
            } else {
                while (sum > target) {
                    res = Math.min(res, j - i + 1);
                    sum = sum - nums[i];
                    i++;
                }
                if (sum == target) {
                    res = Math.min(res, j - i + 1);
                }
                j++;
            }
        }
        if (res == Integer.MAX_VALUE) {
            return 0;
        }
        return res;
    }
}
