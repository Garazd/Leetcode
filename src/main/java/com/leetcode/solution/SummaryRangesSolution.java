package com.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Summary Ranges</b>
 * <p>Level: <i>Easy</i></p>
 * <p>You are given a sorted unique integer array nums.
 * A range [a,b] is the set of all integers from a to b (inclusive).
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
 * Each range [a,b] in the list should be output as:
 * "a->b" if a != b
 * "a" if a == b</p>
 *
 * @see <a href="https://leetcode.com/problems/summary-ranges/description/">228. Summary Ranges</a>
 */
public class SummaryRangesSolution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        int first = nums[0];
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (first == last) {
                    result.add("" + first);
                } else {
                    result.add(first + "->" + last);
                }
                first = nums[i];
            }
            last = nums[i];
        }

        if (first == last) {
            result.add("" + first);
        } else {
            result.add(first + "->" + last);
        }
        return result;
    }
}
