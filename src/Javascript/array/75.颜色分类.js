/*
 * @lc app=leetcode.cn id=75 lang=javascript
 *
 * [75] 颜色分类
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    let p0 = 0, p2 = nums.length - 1;
    for (let i = 0; i <= p2; i++) {
        while (i <= p2 && nums[i] === 2) swap(nums, i, p2--);
        if (nums[i] === 0) swap(nums, i, p0++);
    }
};
const swap = (nums, i, j) => {
    const tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
}
// @lc code=end

