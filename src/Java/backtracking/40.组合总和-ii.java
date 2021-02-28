/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates.length == 0) return res;
        Deque<Integer> path = new ArrayDeque<>();
        // cut
        Arrays.sort(candidates);
        dfs(candidates, target, 0, res, path);
        return res;
    }
    // backtracking
    public void dfs(int[] candidates, int target, int start, List<List<Integer>> res, Deque<Integer> path) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
        if (i > start && candidates[i] == candidates[i - 1]) {
            continue;
        }
            if (candidates[i] > target) break;
            path.addLast(candidates[i]);
            dfs(candidates, target - candidates[i], i + 1, res, path);
            path.removeLast();
        }
    }
}
// @lc code=end

