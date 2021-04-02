/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) return 0;
        int i = 0, flag = 1, res = 0;
        while (i < s.length() && s.charAt(i) == ' ') i++;
        if (i < s.length() && (s.charAt(i) =='-' || s.charAt(i) == '+')) {
            flag = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }
        // !do not forget equal
        while (i < s.length() && s.charAt(i) <= '9' && s.charAt(i) >= '0') {
            int pop = s.charAt(i) - '0';
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > 7)) 
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            else res = res * 10 + pop;
            // ! do not forget to add i
            i++;
        }
        return flag * res;
    }
}
// @lc code=end

