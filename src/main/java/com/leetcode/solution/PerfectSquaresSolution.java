package com.leetcode.solution;

/**
 * <b>Perfect Squares</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given an integer n, return the least number of perfect square numbers that sum to n. A perfect square
 * is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
 * For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.</p>
 *
 * @see <a href="https://leetcode.com/problems/perfect-squares/description/">279. Perfect Squares</a>
 */
public class PerfectSquaresSolution {
    public int numSquares(int n) {
        if (isPerfectSquare(n)) {
            return 1;
        }
        for (int i = 1; i * i < n; i++) {
            if (isPerfectSquare(n - i * i)) {
                return 2;
            }
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) {
            return 4;
        }
        return 3;
    }

    static boolean isPerfectSquare(int n) {
        int x = (int) Math.sqrt(n);
        return x * x == n;
    }
}
