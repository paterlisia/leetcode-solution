/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = find(nums, target, true);
        int right = find(nums, target, false) - 1;
        if (left < nums.length && right < nums.length && nums[left] == target && nums[right] == target) return new int[]{left, right};
        return new int[]{-1, -1};
    }
    public int find(int[] nums, int target, boolean flag) {
        int lo = 0, hi = nums.length - 1, ans = nums.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target || (flag && nums[mid] >= target)) {
                hi = mid - 1;
                ans = mid;
            } else lo = mid + 1;
        }
        return ans;
    }
}
// @lc code=end

