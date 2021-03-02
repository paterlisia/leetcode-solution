/*
 * @lc app=leetcode.cn id=53 lang=javascript
 *
 * [53] 最大子序和
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let maxSum = nums[0], pre = 0;
    for (let i = 0; i < nums.length; i++) {
        // update current dp
        pre = Math.max(pre + nums[i], nums[i]);
        // update max value
        maxSum = Math.max(maxSum, pre);
    }
    return maxSum;
};
// @lc code=end

