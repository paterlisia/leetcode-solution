/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int res = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != res) {
                if (count <= 0) {
                    count = 1;
                    res = nums[i];
                } else count--;
            }
            else count++;
        }
        return res;
    }
}
// @lc code=end

