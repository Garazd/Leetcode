package com.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <b>Merge Intervals</b>
 * <p>Level: <i>Medium</i></p>
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 *
 * @see <a href="https://leetcode.com/problems/merge-intervals/description/">56. Merge Intervals</a>
 */
public class MergeIntervalsSolution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if (intervals == null || intervals.length == 0) {
            return res.toArray(new int[0][]);
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] previous = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (next[0] <= previous[1]) {
                previous[1] = Math.max(previous[1], next[1]);
            } else {
                res.add(previous);
                previous = next;
            }
        }
        res.add(previous);

        return res.toArray(new int[res.size()][]);
    }
}
