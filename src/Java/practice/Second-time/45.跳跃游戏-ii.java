/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int cnt = 0, maxStep = 0, end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxStep = Math.max(maxStep, nums[i] + i);
            if (end == i) {
                end = maxStep;
                cnt++;
            }
        }
        return cnt;
    }
}
// @lc code=end

