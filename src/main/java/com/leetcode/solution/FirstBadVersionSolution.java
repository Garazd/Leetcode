package com.leetcode.solution;

import com.leetcode.util.VersionControl;

/**
 * <b>First Bad Version</b>
 * <p>Level: <i>Easy</i></p>
 * <p>Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.</p>
 *
 * @see <a href="https://leetcode.com/problems/first-bad-version/description/">278. First Bad Version</a>
 */
public class FirstBadVersionSolution extends VersionControl {

    public FirstBadVersionSolution(final int version) {
        super(version);
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int badVersion = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                badVersion = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return badVersion;
    }
}
