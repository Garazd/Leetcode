package com.leetcode.solution;

/**
 * <b>Best Time to Buy and Sell Stock</b>
 * <p>Level: <i>Easy</i></p>
 * <p>You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.</p>
 *
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">121. Best Time to Buy and Sell Stock</a>
 */
public class BestTimeToBuyAndSellStockSolution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;
        for (final int price : prices) {
            if (price < minValue) {
                minValue = price;
            } else if (price - minValue > maxValue) {
                maxValue = price - minValue;
            }
        }
        return maxValue;
    }
}
