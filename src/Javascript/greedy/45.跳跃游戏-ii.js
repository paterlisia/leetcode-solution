/*
 * @lc app=leetcode.cn id=45 lang=javascript
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number}
 */
var jump = function(nums) {
    let end = 0, ans = 0, maxPosition = 0;
    for (let i = 0; i < nums.length  - 1; i++) {
        maxPosition = Math.max(maxPosition, nums[i] + i);
        if (end === i) {
            ans++;
            end = maxPosition;
        }
    }
    return ans;
};
// @lc code=end

