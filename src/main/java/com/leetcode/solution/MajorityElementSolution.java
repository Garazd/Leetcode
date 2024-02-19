package com.leetcode.solution;

/**
 * <b>Majority Element</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Given an array nums of size n, return the majority element.</p>
 *
 * @see <a href="https://leetcode.com/problems/majority-element/description/">169. Majority Element</a>
 */
public class MajorityElementSolution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int number = 0;
        for (final int num : nums) {
            if (count == 0) {
                number = num;
            }
            count += num == number ? 1 : -1;
        }
        return number;
    }
}
