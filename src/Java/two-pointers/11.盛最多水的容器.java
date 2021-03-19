/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int lo = 0, hi = height.length - 1, max = 0;
        while (lo < hi) {
            if (height[lo] > height[hi]) {
                max = Math.max((hi - lo) * height[hi], max);
                hi--;
            }
            else {
                max = Math.max((hi - lo) * height[lo], max);
                lo++;}
        }
        return max;
   } 
}
// @lc code=end

