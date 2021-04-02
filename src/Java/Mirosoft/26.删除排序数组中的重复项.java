/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                int tmp = nums[++i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            } else j++;
        }
        return i + 1;
    }
}
// @lc code=end

