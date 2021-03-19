/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[left] != nums[right]){
                int tmp = nums[++left];
                nums[left] = nums[right];
                nums[right] = tmp;
           } 
            right++;
        }
        return left + 1;
    }
}
// @lc code=end

