/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]){
                int tmp = nums[++i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        return i + 1;
    }
}
// @lc code=end

