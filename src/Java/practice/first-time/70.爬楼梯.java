/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int p = 1, q = 0, t = 0;
        while (n > 0) {
            t = q;
            q = p;
            p = q + t;
            n--;
        }
        return p;
    }
}
// @lc code=end

