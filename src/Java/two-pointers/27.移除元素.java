/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                int tmp = nums[left];
                nums[left++] = nums[right];
                nums[right] = tmp;
            }
        }
        return left;
    }
}
// @lc code=end

