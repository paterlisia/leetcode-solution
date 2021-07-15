/*
 * @lc app=leetcode.cn id=84 lang=java
 *
 * [84] 柱状图中最大的矩形
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] newHeights = new int[heights.length + 2];
        int res = 0;
        for (int i = 1; i <= heights.length; i++) newHeights[i] = heights[i - 1];
        Stack<Integer> leftBoarder = new Stack<>();
        for (int i = 0; i < newHeights.length; i++) {
            while (!leftBoarder.isEmpty() && newHeights[i] < newHeights[leftBoarder.peek()]) {
                int right = leftBoarder.pop();
                int left = leftBoarder.isEmpty() ? -1 : leftBoarder.peek();
                res = Math.max(res, (i - left - 1) * newHeights[right]);
            }
            leftBoarder.push(i);
        }
        return res;
    }
}
// @lc code=end

