/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int lo = 0, hi = height.length - 1, maxVolume = 0;
        while (lo < hi) {
            int volume = (hi - lo) * Math.min(height[lo], height[hi]);
            maxVolume = Math.max(maxVolume, volume);
            if (height[lo] < height[hi]) lo++;
            else hi--;
        }
        return maxVolume;
    }
}
// @lc code=end

