GI/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除有序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (index < 2 || nums[index - 2] != num) nums[index++] = num;
        }
        return index;
    }
}
// @lc code=end

