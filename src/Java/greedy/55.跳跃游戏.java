/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int maxPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            // cannot reach current position then return false
            if (i > maxPosition) return false;
            maxPosition = Math.max(maxPosition, nums[i] + i);
        }
        return true;
    }
}
// @lc code=end

