/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        int res = 0, i = 0, sign = 1;
        if (s.length() == 0) return 0;
        while (i < s.length() && s.charAt(i) == ' ') i++;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) 
            sign = s.charAt(i++) == '+' ? 1 : -1;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            if ((res > Integer.MAX_VALUE / 10) ||
             (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                 return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
             }
             res = res * 10 + s.charAt(i++) - '0';
        }
        return sign * res;
    }
}
// @lc code=end

