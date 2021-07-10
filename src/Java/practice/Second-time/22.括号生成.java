/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtracking(n, 0, 0, "", res);
        return res;
    }
    public void backtracking(int n, int left, int right, String path, List<String> res) {
        if (right == n) {
            res.add(path);
            return;
        }
        if (left < n) {
            backtracking(n, left + 1, right, path + "(", res);
        }
        if (right < left) {
            backtracking(n, left, right + 1, path + ")", res);
        }
    }
}
// @lc code=end

