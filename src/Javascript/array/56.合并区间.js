/*
 * @lc app=leetcode.cn id=56 lang=javascript
 *
 * [56] 合并区间
 */

// @lc code=start
/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function(intervals) {
    const res = [];
    if (intervals === null || intervals.length === 0) return res;
    // sort intervals by start point
    intervals.sort((a, b) => a[0] - b[0]);
    for (let i = 0; i < intervals.length; i++) {
        const left = intervals[i][0];
        let right = intervals[i][1];
        while (i < intervals.length - 1 && intervals[i + 1][0] <= right) {
            // combine intervals
            right = Math.max(right, intervals[i + 1][1]);
            i++;
        }
        // add combined intervals to res
        res.push([left, right]);
    }
    return res;
};
// @lc code=end

