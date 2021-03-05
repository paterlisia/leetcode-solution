/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int p0 = 0, p2 = nums.length - 1;
        // double pointer
        for (int i = 0; i <= p2; i++) {
            // swap untill it does not equal to 2
            while (i <= p2 && nums[i] == 2) swap(nums, i , p2--);
            if (nums[i] == 0) swap(nums, i, p0++);
        }
    }
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
// @lc code=end

