/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(helper(Arrays.copyOfRange(nums, 0, nums.length - 1)), helper(Arrays.copyOfRange(nums, 1, nums.length)));
    }
    public int helper(int[] nums) {
        int cur = 0, pre = 0;
        for (int num : nums) {
            int tmp = cur;
            cur = Math.max(pre + num, cur);
            pre = tmp;
        }
        return cur;
    }
}
// @lc code=end

