/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(nums[i], pre + nums[i]);
            maxSum = Math.max(maxSum, pre);
        }
        return maxSum;
    }
}
// @lc code=end

