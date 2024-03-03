package com.leetcode.solution;

/**
 * <b>Trapping Rain Water</b>
 * <p>Level: <i>Hard</i></p>
 * <p>Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.</p>
 *
 * @see <a href="https://leetcode.com/problems/candy/description/">42. Trapping Rain Water</a>
 */
public class TrappingRainWaterSolution {
    public int trap(int[] height) {
        int length = height.length;
        int[] left = new int[length];
        int[] right = new int[length];
        left[0] = 0;
        right[length - 1] = 0;
        for (int i = 1; i < length; i++) {
            left[i] = Math.max(left[i - 1], height[i - 1]);
        }
        for (int i = length - 2; i >= 0; i--) {
            right[i] = Math.max(height[i + 1], right[i + 1]);
        }

        int waterCount = 0;
        for (int i = 0; i < height.length; i++) {
            int min = Math.min(left[i], right[i]);
            int count = min - height[i];
            if (count > 0) {
                waterCount += count;
            }
        }
        return waterCount;
    }
}
