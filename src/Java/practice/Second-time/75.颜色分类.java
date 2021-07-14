/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int lo = 0, hi = nums.length - 1, p = 0;
        while (p <= hi) {
            while (p < hi && nums[p] == 2) {
                swap(nums, p, hi--);
            }
            if (nums[p] == 0) swap(nums, lo++, p);
            p++;
        }
    }
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
// @lc code=end

