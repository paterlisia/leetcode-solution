/*
 * @lc app=leetcode.cn id=190 lang=java
 *
 * [190] 颠倒二进制位
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int cnt = 32, res = 0;
        while (cnt > 0) {
            res <<= 1;
            res += (n & 1);
            n >>= 1;
            cnt--;
        }
        return res;
    }
}
// @lc code=end

