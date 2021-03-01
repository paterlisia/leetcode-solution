/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int end = 0, maxPosition = 0, ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if (end == i) {
                ans++;
                end = maxPosition;
            }
        }
        return ans;
    }
}
// @lc code=end

