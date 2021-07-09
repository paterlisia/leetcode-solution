/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(n, k, 0, new ArrayDeque<Integer>(), res);
        return res;
    }
    public void backtracking(int n, int k, int start, Deque<Integer> path, List<List<Integer>> res) {
        if (path.size() == k) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = start; i < n; i++) {
            path.offerLast(i + 1);
            backtracking(n, k, i + 1, path, res);
            path.removeLast();
        }
    }
}
// @lc code=end

