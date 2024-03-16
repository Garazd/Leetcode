package com.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <b>3sum</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.</p>
 *
 * @see <a href="https://leetcode.com/problems/3sum/description/">15. 3sum</a>
 */
public class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int a = i + 1;
            int b = nums.length - 1;
            while (a < b) {
                int sum = nums[i] + nums[a] + nums[b];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[a], nums[b]));
                    a++;
                    b--;
                    while (a < b && nums[a] == nums[a - 1]) {
                        a++;
                    }
                    while (a < b && nums[b] == nums[b + 1]) {
                        b--;
                    }
                } else if (sum < 0) {
                    a++;
                } else {
                    b--;
                }
            }
        }
        return result;
    }
}
