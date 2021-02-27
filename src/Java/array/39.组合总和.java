/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) return res;
        // cut
        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, target, len, 0, path, res);
        return res;
    }
    // backtracking
    public void dfs(int[] candidates, int target, int len, int start, Deque<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        // cut
        for (int i = start; i < len; i++) {
            if (target - candidates[i] < 0) break;
            path.addLast(candidates[i]);
            // ! start == i so that element could be reused
            dfs(candidates, target - candidates[i], len, i, path, res);
            path.removeLast();
        }
    }
}
// @lc code=end

