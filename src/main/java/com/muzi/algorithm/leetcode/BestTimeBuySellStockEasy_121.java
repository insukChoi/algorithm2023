package com.muzi.algorithm.leetcode;

/**
 * 121. Best Time to Buy and Sell Stock
 *
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">Best Time to Buy and Sell Stock</a>
 */
public class BestTimeBuySellStockEasy_121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }

        return profit;
    }
}