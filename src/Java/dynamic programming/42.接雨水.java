/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int ans = 0;
        int len = height.length;
        int[] left_max = new int[len];
        int[] right_max = new int[len];
        left_max[0] = height[0];
        // get the array of left max value of current i
        for (int i = 1; i < len; i++) {
            // get max of left side
            left_max[i] = Math.max(height[i], left_max[i  - 1]);
        }
        right_max[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            // get max of right side
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }
        for (int i = 0; i < len; i++) {
            ans += Math.min(left_max[i], right_max[i]) - height[i];
        }
        return ans;
    }
}
// @lc code=end

