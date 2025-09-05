package com.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>Two Sum</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.</p>
 *
 * @see <a href="https://leetcode.com/problems/two-sum/description/">1. Two Sum</a>
 */
public class TwoSumSolution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (integerMap.containsKey(complement)) {
                return new int[]{integerMap.get(complement), i};
            }
            integerMap.put(numbers[i], i);
        }
        return new int[]{};
    }
}
