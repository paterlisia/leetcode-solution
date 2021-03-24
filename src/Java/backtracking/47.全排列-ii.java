/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) return res;
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(nums, 0, res, used, new ArrayDeque<Integer>());
        return res;
    }
    public void backtracking(int[] nums, int start, List<List<Integer>> res, boolean[] used, Deque<Integer> path) {
        if (nums.length == path.size()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            // drop duplications: 1. current start element; 2. used duplicate element
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;
            path.offerLast(nums[i]);
            used[i] = true;
            backtracking(nums, 0, res, used, path);
            used[i] = false;
            path.removeLast();
        }
    }
}
// @lc code=end

