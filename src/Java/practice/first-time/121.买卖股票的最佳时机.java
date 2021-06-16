/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0, minP = Integer.MAX_VALUE;
        for (int p : prices) {
            minP = Math.min(minP, p);
            maxP = Math.max(maxP, p - minP);
        }
        return maxP;
    }
}
// @lc code=end

