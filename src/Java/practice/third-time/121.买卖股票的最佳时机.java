/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0, minPri = prices[0];
        for (int p : prices) {
            minPri = Math.min(minPri, p);
            maxPro = Math.max(maxPro, p - minPri);
        }
        return maxPro;
    }
}
// @lc code=end

