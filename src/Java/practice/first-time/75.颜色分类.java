/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = nums.length - 1;
        for (int p = 0; p <= j; p++) {
            while (p < j && nums[p] == 2) {
                swap(nums, j--, p);
            }
            if (nums[p] == 0) {
                swap(nums, i++, p);
            } 
        }
    }
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
// @lc code=end

