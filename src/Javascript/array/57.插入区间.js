/*
 * @lc app=leetcode.cn id=57 lang=javascript
 *
 * [57] 插入区间
 */

// @lc code=start
/**
 * @param {number[][]} intervals
 * @param {number[]} newInterval
 * @return {number[][]}
 */
var insert = function(intervals, newInterval) {
    const res = [];
    let i = 0;
    const len = intervals.length;
  
    while (i < len && intervals[i][1] < newInterval[0]) {
      res.push(intervals[i]);
      i++;
    }
  
    while (i < len && intervals[i][0] <= newInterval[1]) { 
      newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
      newInterval[1] = Math.max(newInterval[1], intervals[i][1]); 
      i++;
    }
    res.push(newInterval);
  
    while (i < len) { 
      res.push(intervals[i]);
      i++;
    }
    
    return res;
};
// @lc code=end

