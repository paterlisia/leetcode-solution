/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start
class Solution {
    public List<List<String>> partition(String s) {
        boolean[][] judge = new boolean[s.length()][s.length()];
        List<List<String>> res = new ArrayList<List<String>>();
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(judge[i], true); // ? why is the whole row
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                judge[i][j] = (s.charAt(i) == s.charAt(j)) && judge[i + 1][j - 1];
            }
        }
        dfs(s, 0, judge, res, new ArrayList<String>());
        return res;
    }
    public void dfs(String s, int start, boolean[][] judge, List<List<String>> res, List<String> path) {
        if (start == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (judge[start][i]) {
                path.add(s.substring(start, i + 1));
                dfs(s, i + 1, judge, res, path);
                path.remove(path.size() - 1);
            }
        }
    }
}
// @lc code=end

