/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int[] rightMax = new int[height.length - 1], leftMax = new int[height.length - 1];
        int right = height.length - 2, maxTrap = 0;
        rightMax[right + 1] = height[right + 1];
        leftMax[0] = height[0];
        while (right > 0) rightMax[right] = Math.max(rightMax[right + 1], height[right]);
        int left = 1;
        while (left < height.length) {
            leftMax[left] = Math.max(leftMax[left - 1], height[left]);
            maxTrap += Math.min(leftMax[left], rightMax[right]) - height[left++];
        }
        return maxTrap;
    }
}
// @lc code=end

