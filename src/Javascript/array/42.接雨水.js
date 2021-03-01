/*
 * @lc app=leetcode.cn id=42 lang=javascript
 *
 * [42] 接雨水
 */

// @lc code=start
/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function(height) {
    if (height === null || height.length === 0) return 0;
    let ans = 0;
    let leftMax = 0, rightMax = 0;
    let left = 0, right = height.length - 1;
    while (left < right) {
        if (height[left] < height[right]) {
            leftMax = Math.max(height[left], leftMax);
            ans += leftMax - height[left++];
        } else {
            rightMax = Math.max(height[right], rightMax);
            ans += rightMax - height[right--];
        }
    }
    return ans;
};
// @lc code=end

