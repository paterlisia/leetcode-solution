/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        // find the first element who is bigger or equal to target
        int leftIndex = binarySearch(nums, target, true);
        // find the first element who is bigger than target and -1
        int rightIndex = binarySearch(nums, target, false) - 1;
        // boarder cases
        if (leftIndex >= 0 && leftIndex <= rightIndex && rightIndex < nums.length && nums[leftIndex]  == target && nums[rightIndex] == target)
            return new int[]{leftIndex, rightIndex};
        return new int[]{-1, -1};
    }
    // binary search
    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            // different statement as to lower
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else left = mid + 1;
        }
        return ans;
    }
}
// @lc code=end

