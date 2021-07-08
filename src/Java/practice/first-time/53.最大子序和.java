/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], cur = 0;
        for (int num : nums) {
            cur = Math.max(cur + num, num);
            maxSum = Math.max(maxSum, cur);
        }
        return maxSum;
    }
}
// @lc code=end

