/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int lo = 0, hi = 0;
        while (hi < nums.length) {
            if (nums[hi] != val) {
                int tmp = nums[hi];
                nums[hi] = nums[lo];
                nums[lo++] = tmp;
            }
            hi++;
        }
        return lo;
    }
}
// @lc code=end

