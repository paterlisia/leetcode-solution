/*
 * @lc app=leetcode.cn id=16 lang=javascript
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var threeSumClosest = function(nums, target) {
    nums.sort();
    let ans = nums[0] + nums[1] + nums[2];
    const len = nums.length;
    for (let i = 0; i < len; i++) {
        let left = i + 1, right = len - 1;
        while (left < right) {
            const sum = nums[i] + nums[left] + nums[right];
            if (Math.abs(ans - target) > Math.abs(sum - target)) ans = sum;
            if (sum > target) right--;
            else if (sum < target) left++;
            else return ans;
        }
    }
    return ans;
};
// @lc code=end

