/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtracking(nums, res, new ArrayDeque<Integer>(), visited);
        return res;
    }
    public void backtracking(int[] nums, List<List<Integer>> res, Deque<Integer> path, boolean[] visited) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            path.offerLast(nums[i]);
            visited[i] = true;
            backtracking(nums, res, path, visited);
            path.removeLast();
            visited[i] = false;
        }
    }
}
// @lc code=end

