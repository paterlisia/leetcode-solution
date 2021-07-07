/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int cnt = 0, end = 0, maxPosition = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(i + nums[i], maxPosition);
            if (end == i) {
                end = maxPosition;
                cnt++;
            }
        }
        return cnt;

    }
}
// @lc code=end

