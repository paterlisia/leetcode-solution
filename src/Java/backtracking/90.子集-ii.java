/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        dfs(nums, 0, res, new ArrayDeque<>());
        return res;
    }
    public void dfs(int[] nums, int start, List<List<Integer>> res, Deque<Integer> path) {
        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            // remove repeated elements
            // ! i > start
            if (i > start && nums[i] == nums[i - 1]) continue;
            path.addLast(nums[i]);
            dfs(nums, i + 1, res, path);
            path.removeLast();
        }
    }
}
// @lc code=end

