/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, maxAreaValue = 0;
        while(i < j) {
            maxAreaValue = Math.max(maxAreaValue, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) i++;
            else j--;
        }
        return maxAreaValue;
    }
}
// @lc code=end

