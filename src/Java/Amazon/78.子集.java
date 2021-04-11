/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, res, new ArrayDeque<Integer>(), 0);
        return res;
    }
    public void dfs(int[] nums, List<List<Integer>> res, Deque<Integer> path, int start) {
        res.add(new ArrayList<Integer>(path));
        for (int i = start; i < nums.length; i++) {
            path.push(nums[i]);
            dfs(nums, res, path, i + 1);
            path.pop();
        }
    }
}
// @lc code=end

