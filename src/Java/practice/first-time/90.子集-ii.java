/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(nums, 0, new ArrayDeque<Integer>(), res, visited);
        return res;
    }
    public void backtracking(int[] nums, int start, Deque<Integer> path, List<List<Integer>> res, boolean[] visited) {
        res.add(new ArrayList<Integer>(path));
        if (start == nums.length) return;
        for (int i = start; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
            path.offerLast(nums[i]);
            visited[i] = true;
            backtracking(nums, i + 1, path, res, visited);
            visited[i] = false;
            path.removeLast();
        }
    }
}
// @lc code=end

