/*
 * @lc app=leetcode.cn id=275 lang=java
 *
 * [275] H 指数 II
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        int lo = 0, hi = citations.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (citations[mid] >= citations.length - mid) hi = mid - 1;
            else lo = mid + 1; 
        }
        return citations.length - lo;
    }
}
// @lc code=end

