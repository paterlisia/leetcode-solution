/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(k, n, 1, res, new ArrayList<Integer>());
        return res;
    }
    public void backtracking(int k, int n, int start, List<List<Integer>> res, List<Integer> path) {
        if (k == 0 && n == 0) {
            res.add(new ArrayList<>(path));
            return;
        } 
        for (int i = start; i <= 9; i++) {
            if (n < i) break;
            path.add(i);
            backtracking(k - 1, n - i, i + 1, res, path);
            path.remove(path.size() - 1);
        }
    }
}
// @lc code=end

