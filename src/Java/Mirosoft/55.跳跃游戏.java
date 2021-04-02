/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int maxJump = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i > maxJump) return false;
            maxJump = Math.max(nums[i] + i, maxJump);
        }
        return true;
    }
}
// @lc code=end

