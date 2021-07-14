/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuffer res = new StringBuffer();
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || carry > 0; i--, j--) {
            int val1 = i >= 0 ? a.charAt(i) - '0': 0;
            int val2 = j >= 0 ? b.charAt(j) - '0' : 0;
            int sum = carry + val1 + val2;
            res.append(sum % 2);
            carry = sum / 2;
        }
        return res.reverse().toString();
    }
}
// @lc code=end

