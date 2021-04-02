/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(res, candidates, target, new ArrayDeque<Integer>(), 0);
        return res;
    }
    public void backtracking(List<List<Integer>> res, int[] candidates, int target, Deque<Integer> path, int start) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) return;
            path.offerLast(candidates[i]);
            backtracking(res, candidates, target - candidates[i], path, i);
            path.removeLast();
        }
    }
}
// @lc code=end

