/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        for (int i = 1; i < prices.length; i++) {
            maxPro += Math.max(0, prices[i] - prices[i - 1]);
        }
        return maxPro;
    }
}
// @lc code=end

