/*
 * @lc app=leetcode.cn id=85 lang=java
 *
 * [85] 最大矩形
 */

// @lc code=start
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int res = 0;
        int[] heights = new int[matrix[0].length + 2];
        for (int i = 0; i < matrix.length; i++) {
            Deque<Integer> stack = new ArrayDeque<>();
            for (int j = 0; j < heights.length; j++) {
                if (j < matrix[0].length) {
                    if (matrix[i][j] == '0') heights[j + 1] = 0;
                    else heights[j + 1] += 1;
                }
                while (!stack.isEmpty() && heights[stack.peek()] > heights[j]) {
                    int cur = stack.pop();
                    // int leftBound = stack.isEmpty()? -1 : stack.peek();
                    res = Math.max(res, (j - stack.peek() - 1) * heights[cur]);
                }
                stack.push(j);
            }
        }
        return res;
    }
}
// @lc code=end

