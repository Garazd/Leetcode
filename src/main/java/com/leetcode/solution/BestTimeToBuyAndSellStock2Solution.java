package com.leetcode.solution;

/**
 * <b>Best Time to Buy and Sell Stock II</b>
 * <p>Level: <i>Medium</i></p>
 * <p>On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 * Find and return the maximum profit you can achieve.</p>
 *
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/">122. Best Time to Buy and Sell Stock II</a>
 */
public class BestTimeToBuyAndSellStock2Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
