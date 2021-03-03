/*
 * @lc app=leetcode.cn id=57 lang=java
 *
 * [57] 插入区间
 */

// @lc code=start
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            // when there is no overlap
            if (newInterval[0] > intervals[i][1] || newInterval[1] < intervals[i][0])
                res.add(intervals[i]);
            else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }
            res.add(newInterval);
        int[][] ans =  res.toArray(new int[0][]);
        Arrays.sort(ans, (a, b) -> a[0] - b[0]);
        return ans;
    }
}
// @lc code=end

