/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtracking(n, "", res, 0, 0);
        return res;
    }
    public void backtracking(int n, String path, List<String> res, int left, int right) {
        if (path.length() == n * 2) {
            res.add(path);
            return;
        }
        if (left < n) {
            backtracking(n, path + '(', res, left + 1, right);
        }
        if (right < left) {
            backtracking(n, path + ')', res, left, right + 1);
        }
    }
}
// @lc code=end

