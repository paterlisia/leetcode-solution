/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        boolean flag = n > 0 ? true : false;
        long absn = Math.abs((long)n);
        while ( absn > 0) {
            if (absn % 2 == 1) res *= x;
            x *= x;
            absn /= 2;
        }
        return flag? res : 1 / res;
    }
}
// @lc code=end

