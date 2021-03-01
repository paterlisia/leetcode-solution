/*
 * @lc app=leetcode.cn id=41 lang=javascript
 *
 * [41] 缺失的第一个正数
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number}
 */
var firstMissingPositive = function(nums) {
    const len = nums.length;
    for (let i = 0; i < len; i++) {
        while (nums[i] > 0 && nums[i] <= len && nums[nums[i] - 1] != nums[i]) swap(nums, nums[i] - 1, i);
    }
    for (let i = 0; i < len; i++) {
        if (nums[i] != i + 1) return i + 1;
    }
    return len + 1;
};
const swap = (nums, i, j) => {
    const tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
}
// @lc code=end

