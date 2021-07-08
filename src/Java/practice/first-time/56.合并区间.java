/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < intervals.length; i++) {
            int leftIdx = intervals[i][0];
            int rightIdx = intervals[i][1];
            while (i < intervals.length - 1 && intervals[i + 1][0] <= rightIdx) {
                rightIdx = Math.max(rightIdx, intervals[i + 1][1]);
                i++;
            }
            res.add(new int[]{leftIdx, rightIdx});
        }
        return res.toArray(new int[0][]);
    }
}
// @lc code=end

