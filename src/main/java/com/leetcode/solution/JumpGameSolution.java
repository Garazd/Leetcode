package com.leetcode.solution;

/**
 * <b>Jump Game</b>
 * <p>Level: <i>Medium</i></p>
 * <p>You are given an integer array nums. You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise.</p>
 *
 * @see <a href="https://leetcode.com/problems/jump-game/description/">55. Jump Game</a>
 */
public class JumpGameSolution {
    public boolean canJump(int[] nums) {
        int lastIndex = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastIndex) {
                lastIndex = i;
            }
        }
        return lastIndex == 0;
    }
}
