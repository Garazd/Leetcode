package com.leetcode.solution;

/**
 * <b>Pow(x, n)</b>
 * <p>Level: <i>Medium</i></p>
 *
 * <p>Implement pow(x, n), which calculates x raised to the power n (i.e., xn).</p>
 *
 * @see <a href="https://leetcode.com/problems/powx-n/description/">50. Pow(x, n)</a>
 */
public class PowSolution {
    public double myPow(double x, int n) {
        return Math.round(Math.pow(x, n) * 1000.0) / 1000.0;
    }
}
