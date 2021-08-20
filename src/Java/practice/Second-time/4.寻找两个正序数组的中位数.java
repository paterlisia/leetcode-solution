/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int odd = (nums1.length + nums2.length + 1) / 2;
        int even = (nums1.length + nums2.length + 2) / 2;
        return (recurr(nums1, nums2, 0, nums1.length - 1, 0, nums2.length - 1, odd) + recurr(nums1, nums2, 0, nums1.length - 1, 0, nums2.length - 1, even)) * 0.5;
    }
    public int recurr(int[] nums1, int[] nums2, int start1, int end1, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        if (len1 > len2) recurr(nums2, nums1, start2, end2, start1, end1, k);
        if (len1 == 0) return nums2[start2 + k - 1];
        if (k == 1) return Math.min(nums1[start1], nums2[start2]);
        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;
        if (nums1[i] > nums2[j]) {
            return recurr(nums1, nums2, start1, end1, j + 1, end2, k - (j - start2 + 1));
        } else {
            return recurr(nums1, nums2, i + 1, end1, start2, end2, k - (i - start1 + 1));
        }
    }
}
// @lc code=end

