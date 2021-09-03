/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(k, n, 1, res, new ArrayDeque<Integer>());
        return res;
    }
    public void backtracking(int k, int target, int start, List<List<Integer>> res, Deque<Integer> path) {
        if (path.size() == k) {
            if (target == 0) res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = start; i < 10; i++) {
            if (i > target) break;
            path.push(i);
            backtracking(k, target - i, i + 1, res, path);
            path.pop();
        }
    }
}
// @lc code=end

