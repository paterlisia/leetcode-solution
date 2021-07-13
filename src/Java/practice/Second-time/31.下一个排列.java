/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        int hi = nums.length - 2;
        while (hi >= 0 && nums[hi] >= nums[hi + 1]) hi--;
        int j = nums.length - 1;
        if (hi >= 0) {
            while (j >= 0 && nums[j] <= nums[hi]) j--;
            swap(nums, hi, j);
        }
        reverse(nums, hi + 1);
    }
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }
    public void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
// @lc code=end

