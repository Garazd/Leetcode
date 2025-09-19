package com.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <b>Insert Interval</b>
 * <p>Level: <i>Medium</i></p>
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * Return intervals after the insertion.
 *
 * @see <a href="https://leetcode.com/problems/insert-interval/description/">57. Insert Interval</a>
 */
public class InsertIntervalSolution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        if (intervals == null || intervals.length == 0 || intervals[0].length == 0) {
            res.add(newInterval);
            return res.toArray(new int[res.size()][]);
        }

        List<int[]> intervalList = new ArrayList<>(Arrays.asList(intervals));
        intervalList.add(newInterval);
        intervalList.sort(Comparator.comparingInt(o -> o[0]));

        int[] current = intervalList.get(0);
        for (int i = 1; i < intervalList.size(); i++) {
            int[] interval = intervalList.get(i);
            if (interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]);
            } else {
                res.add(current);
                current = interval;
            }
        }
        res.add(current);

        return res.toArray(new int[res.size()][]);
    }
}
