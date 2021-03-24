/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (n == 0) return res;
        backtracking(n, 1, k, res, new ArrayDeque<Integer>());
        return res;
    }
    public void backtracking(int n, int start, int k, List<List<Integer>> res, Deque<Integer> path) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n - (k - path.size()) + 1; i++) {
            path.offerLast(i);
            backtracking(n, i + 1, k, res, path);
            path.removeLast();
        }
    }
}
// @lc code=end

