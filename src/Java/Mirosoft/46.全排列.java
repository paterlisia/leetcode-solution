/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=len
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) return res;
        boolean[] used = new boolean[nums.length];
        backtracking(nums, res, new ArrayDeque<Integer>(), 0, used);
        return res;
    }
    public void backtracking(int[] nums, List<List<Integer>> res, Deque<Integer> path, int len, boolean[] used) {
        if (len == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]){
                path.offerLast(nums[i]);
                used[i] = true;
                backtracking(nums, res, path, len + 1, used);
                used[i] = false;
                path.removeLast();
            }
        }
    }
}
// @lc code=end

