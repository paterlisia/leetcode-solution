/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int tmp = nums[i];
                nums[i++] = nums[j];
                nums[j] = tmp;
            }
        }
        return i;
    }
}
// @lc code=end

