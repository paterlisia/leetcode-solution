/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int p = 0, q = 0, t = 1;
        while (n > 0) {
            p = q;
            q = t;
            t = p + q;
            n--;
        }
        return t;
    }
}
// @lc code=end

