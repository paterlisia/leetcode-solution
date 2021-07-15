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
            Stack<Integer> boarder = new Stack<>();
            for (int j = 0; j < heights.length; j++) {
                if (j < matrix[0].length) {
                    if (matrix[i][j] == '1')
                    heights[j + 1] += 1;
                    else heights[j + 1] = 0;
                }
                    while (!boarder.isEmpty() && heights[boarder.peek()] > heights[j]) {
                        int right = boarder.pop();
                        int left = boarder.isEmpty() ? -1 : boarder.peek();
                        res = Math.max(res, (j - left - 1) * heights[right]);
                    }
                    boarder.push(j);
            }
        }
        return res;
    }
}
// @lc code=end

