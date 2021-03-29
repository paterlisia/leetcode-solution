/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        if (height.length == 0) return 0;
        int area = 0;
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        int[] rightMax = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) 
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
            area += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return area;
    }
}
// @lc code=end

