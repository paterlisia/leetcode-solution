/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int index = 0, p = 0;
        while (p < nums.length) {
            if (nums[index] != nums[p]) {
                int tmp = nums[p];
                nums[p] = nums[++index];
                nums[index] = tmp;
            }
            p++;
        }
        return index + 1;
    }
}
// @lc code=end

