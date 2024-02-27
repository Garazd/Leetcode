package com.leetcode.util;

public class VersionControl {
    private final int bad;

    public VersionControl(final int version) {
        bad = version;
    }

    public boolean isBadVersion(int n) {
        return n >= bad;
    }
}
