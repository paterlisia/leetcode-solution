/*
 * @lc app=leetcode.cn id=264 lang=java
 *
 * [264] 丑数 II
 */

// @lc code=start
class Solution {
    public int nthUglyNumber(int n) {
        int t1 = 0, t2 = 0, t3 = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[t1] * 2, Math.min(dp[t2] * 3, dp[t3] * 5));
            if (dp[i] == dp[t1] * 2) t1++;
            if (dp[i] == dp[t2] * 3) t2++;
            if (dp[i] == dp[t3] * 5) t3++;
        }
        return dp[n - 1];
    }
}
// @lc code=end

