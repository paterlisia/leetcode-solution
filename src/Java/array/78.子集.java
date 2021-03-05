/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        dfs(nums, 0, res, new ArrayDeque<>());
        return res;
    }
    public void dfs(int[] nums, int start, List<List<Integer>> res, Deque<Integer> path) {
        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.addLast(nums[i]);
            dfs(nums, i + 1, res, path);
            path.removeLast();
        }
    }
}
// @lc code=end

