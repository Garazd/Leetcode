package com.leetcode.solution;

/**
 * <b>H-Index</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given an array of integers citations where citations[i] is the number of citations a researcher received
 * for their ith paper, return the researcher's h-index.
 * According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h
 * such that the given researcher has published at least h papers that have each been cited at least h times.</p>
 *
 * @see <a href="https://leetcode.com/problems/h-index/description/">274. H-Index</a>
 */
public class HIndexSolution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] freq = new int[n + 1];
        for (int i : citations) {
            if (i > n) {
                freq[n]++;
            } else {
                freq[i]++;
            }
        }
        int cnt = 0;
        for (int i = n; i >= 0; i--) {
            cnt += freq[i];
            if (cnt >= i) {
                return i;
            }
        }
        return 0;
    }
}
