package com.leetcode.solution;

import java.util.Arrays;

/**
 * <b>H-Index II</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given an array of integers citations where citations[i] is the number of citations a researcher received for their
 * ith paper and citations is sorted in ascending order, return the researcher's h-index.
 * According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h
 * such that the given researcher has published at least h papers that have each been cited at least h times.</p>
 *
 * @see <a href="https://leetcode.com/problems/h-index-ii/description/">275. H-Index II</a>
 */
public class HIndex2Solution {
    public int hIndex(int[] citations) {
        int j = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > j) {
                j++;
            }
        }
        return j;
    }
}
