package com.leetcode.solution;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <b>Minimum Number of Arrows to Burst Balloons</b>
 * <p>Level: <i>Medium</i></p>
 * There are some spherical balloons taped onto a flat wall that represents the XY-plane.
 * The balloons are represented as a 2D integer array points where points[i] = [xstart, xend]
 * denotes a balloon whose horizontal diameter stretches between xstart and xend.
 * You do not know the exact y-coordinates of the balloons.
 * Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis.
 * A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend.
 * There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely,
 * bursting any balloons in its path.
 * Given the array points, return the minimum number of arrows that must be shot to burst all balloons.
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/">452. Minimum Number of Arrows to Burst Balloons</a>
 */
public class MinimumNumberOfArrowsToBurstBalloonsSolution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        int count = 1;
        int[] first = points[0];
        for (int i = 1; i < points.length; i++) {
            final int[] next = points[i];
            if (first[1] < next[0]) {
                count++;
            } else {
                next[1] = Math.min(first[1], next[1]);
            }
            first = next;
        }

        return count;
    }
}
