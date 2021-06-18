/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s.length() == 0) return res;
        char[] charArray = s.toCharArray();
        int len = s.length();
        // 预处理
        // 状态：dp[i][j] 表示 s[i][j] 是否是回文
        boolean[][] dp = new boolean[len][len];
        // 状态转移方程：在 s[i] == s[j] 的时候，dp[i][j] 参考 dp[i + 1][j - 1]
        for (int right = 0; right < len; right++) {
            // 注意：left <= right 取等号表示 1 个字符的时候也需要判断
            for (int left = 0; left <= right; left++) {
                if (charArray[left] == charArray[right] && (right - left <= 2 || dp[left + 1][right - 1])) {
                    dp[left][right] = true;
                }
            }
        }
        dfs(s, res, new ArrayList<String>(), 0, dp);
        return res;
    }

    public void dfs(String s, List<List<String>> res, List<String> path, int start, boolean[][] judge) {
        if (start == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
         for (int i = start; i < s.length(); i++) {
             if (judge[start][i]) {
                path.add(s.substring(start, i + 1));
                dfs(s, res, path, i + 1, judge);
                path.remove(path.size() - 1);
             }
         }
    }
}
// @lc code=end

