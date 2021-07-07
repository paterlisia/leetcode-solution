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
        backtracking(candidates, 0, target, new ArrayDeque<Integer>(), res);
        return res;
    }
    public void backtracking(int[] candidates, int start, int target, Deque<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            System.out.println(path);
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) continue;
            path.offerLast(candidates[i]);
            backtracking(candidates, i, target - candidates[i], path, res);
            path.removeLast();
        }
    }
}
// @lc code=end

