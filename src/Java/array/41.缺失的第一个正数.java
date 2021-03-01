/*
 * @lc app=leetcode.cn id=41 lang=java
 *
 * [41] 缺失的第一个正数
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            // put the element to its value + 1 as index position
            while (nums[i] > 0 && nums[i] <= len && nums[nums[i] - 1] != nums[i])
            swap(nums, nums[i] - 1, i);
        }
        // find the element not eqaul to index + 1
        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) return i + 1;
        }
        return len + 1;
    }
    // swap element in nums
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }
}
// @lc code=end

