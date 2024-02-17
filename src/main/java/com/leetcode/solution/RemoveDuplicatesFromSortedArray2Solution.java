package com.leetcode.solution;

/**
 * <b>Remove Duplicates from Sorted Array II</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Since it is impossible to change the length of the array in some languages, you must instead have
 * the result be placed in the first part of the array nums. More formally,
 * if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * Return k after placing the final result in the first k slots of nums.</p>
 *
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/">80. Remove Duplicates from Sorted Array II</a>
 */
public class RemoveDuplicatesFromSortedArray2Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count < 2 || nums[i] > nums[count - 2]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
