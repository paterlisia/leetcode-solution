/*
 * @lc app=leetcode.cn id=26 lang=javascript
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let i = 0;
    for (let j = 0; j < nums.length; j++) {
        if (nums[i] !== nums[j]) {
            i = i + 1;
            const tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
    return i + 1;
};
// @lc code=end

