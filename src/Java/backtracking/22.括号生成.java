/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        backtracking(res, "", 0, 0, n);
        return res;
    }
    public void backtracking(List<String> res, String path, int left, int right, int len) {
        if (len * 2 == path.length()) {
            res.add(path);
            return;
        }
        if (left < len) {
            backtracking(res, path + "(", left + 1, right, len);
        }
        if (right < left) {
            backtracking(res, path + ")", left, right + 1, len);
        }
    }
}
// @lc code=end

