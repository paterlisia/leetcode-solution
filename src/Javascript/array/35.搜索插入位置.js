/*
 * @lc app=leetcode.cn id=35 lang=javascript
 *
 * [35] 搜索插入位置
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    let left = 0, right = nums.length - 1, ans = right + 1;
    while (left <= right) {
        const mid = Math.floor((left + right) / 2);
        if (nums[mid] >= target) {
            ans = mid;
            right = mid - 1
        }
        else left = mid + 1;
    }
    return ans;
};
// @lc code=end

