/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int maxPosition = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (maxPosition < i) return false;
            maxPosition = Math.max(maxPosition, i + nums[i]);
        }
        return true;
    }
}
// @lc code=end

