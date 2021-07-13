/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int m = num1.length(), n = num2.length();
        StringBuffer res = new StringBuffer();
        int[] mul = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int val1 = num1.charAt(i) - '0';
                int val2 = num2.charAt(j) - '0';
                int ans = mul[i + j + 1] + val1 * val2;
                mul[i + j + 1] = ans % 10;
                mul[i + j] += ans / 10;
            }
        }
        for (int i = 0; i < m + n; i++) {
            if (mul[i] == 0 && i == 0)  continue;
            res.append(mul[i]);
        }
        return res.toString();
    }
}
// @lc code=end

