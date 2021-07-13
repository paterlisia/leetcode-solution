/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(candidates, target, 0, new ArrayDeque<Integer>(), res);
        return res;
    }
    public void backtracking(int[] candidates, int target, int start, Deque<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (target < candidates[i]) continue;
            path.offerLast(candidates[i]);
            backtracking(candidates, target - candidates[i], i, path, res);
            path.pollLast();
        }
    }
}
// @lc code=end

