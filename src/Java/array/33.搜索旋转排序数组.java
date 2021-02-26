/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            // judge target locate at which side of the array
            if (nums[0] <= target) {
                // judge mid locate at which side of the array
                if (nums[0] > nums[mid]) nums[mid] = Integer.MAX_VALUE;
            } else {
                if (nums[0] <= nums[mid]) nums[mid] = Integer.MIN_VALUE;
            }
            // binary search
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // not found
        return -1;
    }
}
// @lc code=end

