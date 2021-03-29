/*
 * @lc app=leetcode.cn id=84 lang=java
 *
 * [84] 柱状图中最大的矩形
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] newHeights = new int[heights.length + 2];
        int res = 0;
        for (int i = 1; i < heights.length + 1; i++) newHeights[i] = heights[i - 1];
        for (int i = 0; i < newHeights.length; i++) {
            while (!stack.isEmpty() && newHeights[stack.peek()] > newHeights[i]) {
                int cur = stack.pop();
                res = Math.max(res, (i - stack.peek() - 1) * newHeights[cur]);
            }
            stack.push(i);
        }
        return res;
    }
}
// @lc code=end

