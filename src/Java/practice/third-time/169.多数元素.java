/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0], cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != majority) {
                if (cnt == 0) {
                    majority = nums[i];
                    cnt = 1;
                } else cnt--;
            } else cnt++;
        }
        return majority;

    }
}
// @lc code=end

