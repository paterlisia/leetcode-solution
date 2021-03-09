/*
 * @lc app=leetcode.cn id=85 lang=java
 *
 * [85] 最大矩形
 */

// @lc code=start
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int[] heights = new int[matrix[0].length + 1];
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            Deque<Integer> stack = new ArrayDeque<>();
            heights[matrix[0].length] = 0;
            // ! until maxtrix[0].length
            for (int j = 0; j <= matrix[0].length; j++) {
                // count the height of the bar => transfer to problem 84
                if (j < matrix[0].length) {
                    if (matrix[i][j] == '1') heights[j]++;
                    else heights[j] = 0;
                }
                // problem 84(count the max matrix row by row)
                while (!stack.isEmpty() && heights[j] < heights[stack.peek()]) {
                    int cur = stack.pop();
                    int leftLessMin = stack.isEmpty()? -1 : stack.peek();
                    res = Math.max(res, (j - leftLessMin - 1) * heights[cur]);
                }
                stack.push(j);
            }
        }
        return res;
    }
}
// @lc code=end

