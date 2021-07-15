/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, p = m + n - 1;
        while (j >= 0 && i >= 0) {
            if (nums2[j] > nums1[i]) nums1[p--] = nums2[j--];
            else nums1[p--] = nums1[i--];
        }
        System.arraycopy(nums2, 0, nums1, 0, j + 1);
    }
}
// @lc code=end

