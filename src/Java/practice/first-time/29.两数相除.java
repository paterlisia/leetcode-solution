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
        int flag = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0) ? 1 : -1;
        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);
        int res = 0;
        while (dividend <= divisor) {
            int tmp = divisor;
            int c = 1;
            while (dividend - tmp <= tmp) {
                tmp <<= 1;
                c <<= 1;
            }
            dividend -= tmp;
            res += c;
        }
        return res * flag;
    }
}
// @lc code=end

