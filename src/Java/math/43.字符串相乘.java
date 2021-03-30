/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int[] res = new int[num2.length() + num1.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            int n1 = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0';
                int sum = res[i + j + 1] + n1 * n2;
                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }
        StringBuilder mul = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0 && i == 0) continue;
            mul.append(res[i]);
        }
        return mul.toString();
    }
}
// @lc code=end

