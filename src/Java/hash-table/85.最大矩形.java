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
        int[] heights = new int[matrix[0].length + 1];
        for (int i = 0; i < matrix.length; i++) {
            Deque<Integer> stack = new ArrayDeque<Integer>();
            heights[matrix[0].length] = 0;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
            for (int j = 0; j <= matrix[0].length; j++) {
                if (j < matrix[0].length) {
                    if (matrix[i][j] == '1') heights[j] += 1;
                    else heights[j] = 0;
                }
                while (!stack.isEmpty() && heights[stack.peek()] > heights[j]) {
                    int cur = stack.pop();
                    int leftMinIdx = stack.isEmpty() ? -1 : stack.peek();
                    res = Math.max(res, (j - leftMinIdx - 1) * heights[cur]);
                }
                stack.push(j);
            }
        }
        return res;
    }
}
// @lc code=end

