/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(dp(Arrays.copyOfRange(nums, 0, nums.length - 1)), dp(Arrays.copyOfRange(nums, 1, nums.length)));
    }
    public int dp(int[] nums) {
        int pre = 0, cur = 0, tmp;
        for (int num : nums) {
            tmp = cur;
            cur = Math.max(cur, pre + num);
            pre = tmp;
        }
        return cur;
    }
}
// @lc code=end

