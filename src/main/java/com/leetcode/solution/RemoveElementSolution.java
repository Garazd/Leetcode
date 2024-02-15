package com.leetcode.solution;

/**
 * <b>Remove Element</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.</p>
 *
 * @see <a href="https://leetcode.com/problems/remove-element/description/">27. Remove Element</a>
 */
public class RemoveElementSolution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
