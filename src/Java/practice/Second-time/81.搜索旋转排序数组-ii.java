/*
 * @lc app=leetcode.cn id=81 lang=java
 *
 * [81] 搜索旋转排序数组 II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return true;
            if (nums[lo] < nums[mid]) {
                if (target < nums[mid] && nums[lo] <= target) hi = mid - 1;
                else lo = mid + 1;
            } else if (nums[mid] == nums[lo]) lo++; 
            else {
                if (target <= nums[hi] && target > nums[mid]) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        return false;
    }
}
// @lc code=end

