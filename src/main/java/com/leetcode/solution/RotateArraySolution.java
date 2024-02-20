package com.leetcode.solution;

/**
 * <b>Rotate Array</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.</p>
 *
 * @see <a href="https://leetcode.com/problems/rotate-array/description/">189. Rotate Array</a>
 */
public class RotateArraySolution {
    public int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        return nums;
    }

    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
