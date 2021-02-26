/*
 * @lc app=leetcode.cn id=33 lang=javascript
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    let left = 0, right = nums.length - 1;
    const maxNumber = Math.pow(10, 4);
    // ! =
    while (left <= right) {
        const mid = Math.floor((left + right) / 2);
        if (nums[mid] === target) return mid;
        // judge target locate at which side of the array
        if (target >= nums[0]) {
            // judge mid locate at which side of the array
            if (nums[mid] < nums[0]) nums[mid] = maxNumber; // sort
        } else {
            // ! =
            if (nums[mid] >= nums[0]) nums[mid] = -maxNumber; // sort
        }
        // binary search
        if (nums[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return -1;
};
// @lc code=end

