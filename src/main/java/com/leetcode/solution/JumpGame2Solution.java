package com.leetcode.solution;

/**
 * <b>Jump Game II</b>
 * <p>Level: <i>Medium</i></p>
 * <p>You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words,
 * if you are at nums[i], you can jump to any nums[i + j] where:</p>
 *
 * @see <a href="https://leetcode.com/problems/jump-game-ii/description/">45. Jump Game II</a>
 */
public class JumpGame2Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int curr = 0;
        int farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, nums[i] + i);
            if (i == curr) {
                curr = farthest;
                jump++;
            }
        }
        return jump;
    }
}
