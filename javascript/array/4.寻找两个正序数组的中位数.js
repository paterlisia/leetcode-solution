/*
 * @lc app=leetcode.cn id=4 lang=javascript
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
<<<<<<< HEAD
//// process exited with signal SIGSEGV
// !solve: Math.floor()
=======
// TODO: process exited with signal SIGSEGV
>>>>>>> f87e8e242e1868ea13d5a4dccc0689ba3ebf3c52
// return the Kth min number
const getKth = (nums1, start1, end1, nums2, start2, end2, k) => {
    const len1 = end1 - start1 + 1;
    const len2 = end2 - start2 + 1;
    if (len1 > len2) return getKth(nums2, start2, end2, nums1, start1, end1, k); // make sure len1 < len2
    if (len1 === 0) return nums2[start2 + k - 1]; // the kth element in nums2
    if (k === 1) return Math.min(nums1[start1], nums2[start2]);  // end of loop: k = 1
    const i = start1 + Math.min(len1, Math.floor(k / 2)) - 1; // get the k / 2 element and in case of out of boarder
    const j = start2 +  Math.min(len2, Math.floor(k / 2)) - 1;
    if (nums1[i] < nums2[j]) return getKth(nums1, i +  1, end1, nums2, start2, end2, k - (i - start1 + 1));
    return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
};

var findMedianSortedArrays = function(nums1, nums2) {
    const m = nums1.length;
    const n = nums2.length;
    const left = Math.floor((m + n + 1) / 2);
    const right = Math.floor((m + n + 2) / 2);
    return (getKth(nums1, 0, m - 1, nums2, 0, n - 1, left) + getKth(nums1, 0, m - 1, nums2, 0, n - 1, right)) / 2; // combine condition of odd and even
};


// @lc code=end

