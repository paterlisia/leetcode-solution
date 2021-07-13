/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        boolean flag = n > 0 ? true : false;
        long absN = Math.abs((long) n);
        double res = 1;
        while (absN != 0) {
            if (absN % 2 == 1) {
                res *= x;
            }
            x *= x;
            absN /= 2;
        }
        return flag ? res : 1 / res;
    }
}
// @lc code=end

