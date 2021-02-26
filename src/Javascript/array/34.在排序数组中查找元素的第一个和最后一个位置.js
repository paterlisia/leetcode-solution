/*
 * @lc app=leetcode.cn id=34 lang=javascript
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    // find the first element bigger or equal to target
    const leftIndex = binarySearch(nums, target, true);
    // find the first element bigger than target
    const rightIndex = binarySearch(nums, target, false) - 1;
    // boader protection
    if (leftIndex >= 0 && leftIndex <= rightIndex && rightIndex < nums.length && nums[leftIndex] === target && nums[rightIndex] === target)
    return [leftIndex, rightIndex];
    return [-1, -1];
};

// normal binary search
const binarySearch = (nums, target, lower) => {
    let left = 0, right = nums.length - 1, ans = nums.length;
    while (left <= right) {
        const mid = Math.floor((left + right) / 2);
        if (nums[mid] > target || (lower && nums[mid] >= target)) {
            right = mid - 1;
            ans = mid;
        } else left = mid + 1;
    }
    return ans;
}
// @lc code=end

