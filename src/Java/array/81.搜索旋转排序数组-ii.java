/*
 * @lc app=leetcode.cn id=81 lang=java
 *
 * [81] 搜索旋转排序数组 II
 */

// @lc code=left
class Solution {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return true;
            if (nums[mid] == nums[left]) {
                left++;
                continue;
            }
            // mid in the left part
            if (nums[mid] > nums[left]) {
                // target in the left part
                if (target >= nums[left] && target < nums[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target > nums[mid] && nums[right] >= target) left = mid + 1;
                else right = mid -1;
            }
        }
        return false;
    }
}
// @lc code=end

