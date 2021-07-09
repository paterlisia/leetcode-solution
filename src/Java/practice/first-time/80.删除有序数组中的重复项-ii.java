/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除有序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int x : nums) {
            if (index < 2 || nums[index - 2] != x) nums[index++] = x;
        }
        return index;
    }
}
// @lc code=end

