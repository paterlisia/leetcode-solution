/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backtracking(nums, new ArrayDeque<Integer>(), res, 0);
        return res;
    }
    public void backtracking(int[] nums, Deque<Integer> path, List<List<Integer>> res, int start) {
        res.add(new ArrayList<Integer>(path));
        if (start == nums.length) return;
        for (int i = start; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            path.offerLast(nums[i]);
            backtracking(nums, path, res, i + 1);
            path.removeLast();
        }
    }
}
// @lc code=end

