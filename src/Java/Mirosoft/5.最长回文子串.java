/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        boolean[][] dp = new boolean[s.length() ][s.length()];
        int start = 0, len = 1;
        for (int i = 0; i < s.length(); i++) dp[i][i] = true;
        for (int j = 1; j < s.length(); j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 3) dp[i][j] = true;
                    else dp[i][j] = dp[i + 1][j - 1];
                } else dp[i][j] = false;
                if (dp[i][j] && j - i + 1 > len) {
                    start = i;
                    len = j - i + 1;
                } 
            }
        }
        return s.substring(start, start + len);
    }
}
// @lc code=end

