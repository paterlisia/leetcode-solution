/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        for (int p = 1; p < prices.length; p++) {
            maxPro += Math.max(0, prices[p] - prices[p - 1]);
        }
        return maxPro;
    }
}
// @lc code=end

