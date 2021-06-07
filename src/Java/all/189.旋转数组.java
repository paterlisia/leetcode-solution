/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        // reverse the whole array
        reverse(nums, 0, nums.length - 1);
        // reverse the two seperate part
        reverse(nums, 0, k % nums.length - 1);
        reverse(nums, k % nums.length, nums.length - 1);
    }
    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}
// @lc code=end

