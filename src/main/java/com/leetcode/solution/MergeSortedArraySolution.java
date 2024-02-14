package com.leetcode.solution;

/**
 * <b>Merge Sorted Array</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Merge nums1 and nums2 into a single array sorted in non-decreasing order.</p>
 *
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/description/">88. Merge Sorted Array</a>
 */
public class MergeSortedArraySolution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1, b = n - 1, c = m + n - 1;
        while (b >= 0) {
            if (a >= 0 && nums1[a] > nums2[b]) {
                nums1[c--] = nums1[a--];
            } else {
                nums1[c--] = nums2[b--];
            }
        }
        return nums1;
    }
}
