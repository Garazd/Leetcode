package com.leetcode.solution;

/**
 * <b>Two Sum II - Input Array Is Sorted</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number. Let these two numbers
 * be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.</p>
 *
 * @see <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">167. Two Sum II - Input Array Is Sorted</a>
 */
public class TwoSum2InputArrayIsSortedSolution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int currentSum = numbers[left] + numbers[right];
        while (currentSum != target) {
            if (currentSum > target) {
                right--;
            } else {
                left++;
            }
            currentSum = numbers[left] + numbers[right];
        }
        return new int[]{++left, ++right};
    }
}
