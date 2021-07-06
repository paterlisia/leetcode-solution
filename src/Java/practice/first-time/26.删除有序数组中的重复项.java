/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int lo = 0, hi = 0;
        while (hi < nums.length) {
            if (nums[lo] != nums[hi]) {
                int tmp = nums[++lo];
                nums[lo] = nums[hi];
                nums[hi++] = tmp;
            } else hi++;
        }
        return lo + 1;
    }
}
// @lc code=end

