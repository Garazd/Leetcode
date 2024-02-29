package com.leetcode.solution;

/**
 * <b>Product of Array Except Self</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given an integer array nums, return an array answer such that answer[i]
 * is equal to the product of all the elements of nums except nums[i].</p>
 *
 * @see <a href="https://leetcode.com/problems/product-of-array-except-self/description/">238. Product of Array Except Self</a>
 */
public class ProductOfArrayExceptSelfSolution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];

        result[0] = 1;
        for (int i = 1; i < size; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = size - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        return result;
    }
}
