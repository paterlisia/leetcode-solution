/*
 * @lc app=leetcode.cn id=80 lang=javascript
 *
 * [80] 删除排序数组中的重复项 II
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let j = 1, count = 1;
    for (let i = 1; i < nums.length; i++) {
        // repeated element
        if (nums[i] == nums[i - 1]) {
            count++;
        } else {
            count = 1;
        }
        // overlap num[j] when number of repeated elements < 2
        if (count <= 2) {
            nums[j++] = nums[i];
        }
    }
    return j;
};
// @lc code=end

