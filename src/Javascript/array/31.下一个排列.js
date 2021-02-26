/*
 * @lc app=leetcode.cn id=31 lang=javascript
 *
 * [31] 下一个排列
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function(nums) {
    let i = nums.length - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) i--;
    if (i >= 0) {
        let j = nums.length - 1;
        while (j >= 0 && nums[i] >= nums[j]) j--;
        swap(nums, i , j);
    }
    reverse(nums, i + 1);
};
const swap = (nums, i, j) => {
    const tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
}
const reverse = (nums, start) => {
    let end = nums.length - 1;
    while (start < end) {
        swap(nums, start++, end--);
    }
}
// @lc code=end

