/*
 * @lc app=leetcode.cn id=274 lang=java
 *
 * [274] H 指数
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1];
        for (int c : citations) {
            if (c > n) count[n] += 1;
            else count[c] += 1;
        }
        int cnt = 0;
        for (int i = n; i >= 0; i--) {
            cnt += count[i]; // number of papers for now
            if (cnt >= i) return i; // number of papers exceeds citations
        }
        return 0;
    }
}
// @lc code=end

