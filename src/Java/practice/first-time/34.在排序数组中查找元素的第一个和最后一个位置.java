/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false) - 1;
        if (left >= 0 && left < nums.length && right >= 0 && right < nums.length && nums[left] == target && nums[right] == target)
        return new int[]{left, right};
        else return new int[]{-1, -1};
    }
    public int binarySearch(int[] nums, int target, boolean flag) {
        int lo = 0, hi = nums.length - 1;
        int res = nums.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= target && flag || target < nums[mid]) {
                res = mid;
                hi = mid - 1;
            } else lo = mid + 1;
        }
        return res;
    }
}
// @lc code=end

