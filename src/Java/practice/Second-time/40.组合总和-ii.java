/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[candidates.length];
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, new ArrayDeque<Integer>(), res, visited);
        return res;
    }
    public void backtracking(int[] candidates, int target, int start, Deque<Integer> path, List<List<Integer>> res, boolean[] visited) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (target < candidates[i] || (i > 0 && candidates[i] == candidates[i - 1] && !visited[i - 1])) continue;
            path.offerLast(candidates[i]);
            visited[i] = true;
            backtracking(candidates, target - candidates[i], i + 1, path, res, visited);
            path.pollLast();
            visited[i] = false;
        }
    }
    
}
// @lc code=end

