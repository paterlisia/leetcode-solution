/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int p = 0, q = 0, cur = 1;
        for (int i = 1; i <= n; i++) {
            q = p;
            p = cur;
            cur = p + q;
        }
        return cur;
    }
}
// @lc code=end

