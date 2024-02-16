package com.leetcode.solution;

/**
 * <b>Remove Duplicates from Sorted Array</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Change the array nums such that the first k elements of nums contain the unique elements in the order
 * they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.</p>
 *
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/">26. Remove Duplicates from Sorted Array</a>
 */
public class RemoveDuplicatesFromSortedArraySolution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0 || nums[count - 1] != nums[i]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
