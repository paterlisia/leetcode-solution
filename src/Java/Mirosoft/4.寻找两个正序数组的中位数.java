/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int odd = (m + n + 1) / 2;
        int even = (m + n + 2) / 2;
        return (recurHelper(nums1, nums2, 0, 0, m -1, n - 1, odd) + recurHelper(nums1, nums2, 0, 0, m -1, n - 1, even)) / 2 ;
    }
    public int recurHelper(int[] nums1, int[] nums2, int start1, int start2, int end1, int end2, int end) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        if (len1 > len2) return recurHelper(nums2, nums1, start2, start1, end2, end1, end);
        if (len1 == 0) return nums2[end + start2 - 1];
        if (end == 1) return Math.min(nums1[start1], nums2[start2]);
        int i = start1 + Math.min(len1, end / 2) - 1;
        int j = start2 + Math.min(len2, end / 2) - 1;
        if (nums1[i] < nums2[j]) {
            return recurHelper(nums1, nums2, i + 1, start2, end1, end2, end - (i - start1 + 1));
        } else {
            return recurHelper(nums1, nums2, start1, j + 1, end1, end2, end - (j - start2 + 1));
        }
    }
}
// @lc code=end

