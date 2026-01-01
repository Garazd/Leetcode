package com.leetcode.solution;

/**
 * <b>Median of Two Sorted Arrays</b>
 * <p>Level: <i>Hard</i></p>
 *
 * <p>Given two sorted arrays nums1 and nums2 of size m and n respectively,
 * return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).</p>
 *
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/description/">4. Median of Two Sorted Arrays</a>
 */
public class MedianOfTwoSortedArraysSolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final int n = nums1.length;
        final int m = nums2.length;
        int i = 0, j = 0, k = 0;
        int[] merged = new int[n + m];

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < n) {
            merged[k++] = nums1[i++];
        }
        while (j < m) {
            merged[k++] = nums2[j++];
        }

        final int count = n + m;
        if (count % 2 == 0) {
            return (double) (merged[count / 2] + merged[count / 2 - 1]) / 2;
        } else {
            return merged[count / 2];
        }
    }
}
