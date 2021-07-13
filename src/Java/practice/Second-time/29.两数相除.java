/*
 * @lc app=leetcode.cn id=29 lang=java
 *
 * [29] 两数相除
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
        return Integer.MAX_VALUE;
        if (dividend == 0) return 0;
        int flag = (dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0) ? 1 : -1;
        int nomerator = -Math.abs(dividend);
        int denomerator = -Math.abs(divisor);
        int cnt = 0;
        while (nomerator <= denomerator) {
            int tmp = denomerator, c = 1;
            while (tmp >= nomerator - tmp) {
                tmp <<= 1;
                c <<= 1;
            }
            nomerator -= tmp;
            cnt += c;
        }
        return cnt * flag;
    }
}
// @lc code=end

