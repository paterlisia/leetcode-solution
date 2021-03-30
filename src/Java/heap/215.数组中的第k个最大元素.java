/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        return merge(nums, 0, nums.length - 1, k);
    }
    public int merge(int[] nums, int left, int right, int k) {
        if (left <= right) {
            int pivot = partition(nums, left, right);
            if (k - 1 == pivot) return nums[pivot];
            else if (k - 1 > pivot) return merge(nums, pivot + 1, right, k);
            else return merge(nums, left, pivot - 1, k);
        }
        return -1;
    }
    public int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        while (left < right) {
            while (left < right && nums[right] <= pivot) right--;
            nums[left] = nums[right];
            while (left < right && nums[left] >= pivot) left++;
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }
}
// @lc code=end

