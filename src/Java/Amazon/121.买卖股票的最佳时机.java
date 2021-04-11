/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0, minPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxP = Math.max(maxP, prices[i] - minPrice);
        }
        return maxP;
    }
}
// @lc code=end

