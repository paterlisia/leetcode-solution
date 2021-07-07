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
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, res, new ArrayDeque<Integer>());
        return res;
    }
    public void backtracking(int[] candidates, int target, int start, List<List<Integer>> res, Deque<Integer> path) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) continue;
            path.offerLast(candidates[i]);
            backtracking(candidates, target - candidates[i], i + 1, res, path);
            path.removeLast();
        }
    }
}
// @lc code=end

