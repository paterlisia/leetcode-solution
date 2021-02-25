/*
 * @lc app=leetcode.cn id=15 lang=javascript
 *
 * [15] 三数之和
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    // return ans
    const resArray = [];
    // special cases
    if (nums === null || nums.length < 3) return resArray;
    const len = nums.length;
    nums.sort((a, b) => a - b);
    for (let i = 0; i < len; i++) {
        if (i > 0 && nums[i] === nums[i - 1]) continue;
        if (nums[i] > 0) break;
        let left = i + 1, right = len - 1;
        while(left < right) {
            const res = nums[i] + nums[left] + nums[right];
            if (res === 0) {
                resArray.push([nums[i], nums[left], nums[right]]);
                while (left < right && nums[left] === nums[left + 1]) left++;
                while (left < right && nums[right] === nums[right - 1]) right--;
                left++;
                right--;
            } else if (res > 0) {
                right--;
            } else {
                left++;
            }
        }
    }
    return resArray;
};
// @lc code=end

