/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        // ! equal
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return mid;
            // ! equal
            if (nums[lo] <= nums[mid]) {
                if (nums[mid] > target && target >= nums[lo]) hi = mid - 1;
                else lo = mid +1;
            } else {
                if (nums[mid] < target && target <= nums[hi]) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        return -1;
    }
}
// @lc code=end

