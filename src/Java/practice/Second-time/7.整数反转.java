/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int remain = x % 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && remain > Integer.MAX_VALUE % 10)) return 0;
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && remain < Integer.MIN_VALUE % 10)) return 0;
            res = res * 10 + remain;
            x /= 10;
        }
        return res;
    }
}
// @lc code=end

