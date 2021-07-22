/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int right = 0; right < s.length(); right++) {
            for (int left = 0; left <= right; left++) {
                if (s.charAt(left) == s.charAt(right) && (right - left <= 2 || dp[left + 1][right - 1])) {
                    dp[left][right] = true;
                }
            }
        }
        backtracking(s, 0, dp, new ArrayList<String>(), res);
        return res;
    }
    public void backtracking(String s, int start, boolean[][] dp, List<String> path, List<List<String>> res) {
        if (start == s.length()) {
            res.add(new ArrayList<String>(path));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (dp[start][i]) {
                path.add(s.substring(start, i + 1));
                backtracking(s, i + 1, dp, path, res);
                path.remove(path.size() - 1);
            }
        }
    }
}
// @lc code=end

