/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
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
            if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1]) continue;
            path.offerLast(nums[i]);
            visited[i] = true;
            backtracking(nums, res, path, visited);
            path.removeLast();
            visited[i] = false;
        }
    }
}
// @lc code=end

