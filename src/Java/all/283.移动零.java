/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int lo = 0, hi = 0;
        for (; hi < nums.length; hi++) {
            if (nums[hi] != 0) {
                int tmp = nums[lo];
                nums[lo++] = nums[hi];
                nums[hi] = tmp;
            }
        }
    }
}
// @lc code=end

