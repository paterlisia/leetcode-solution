/*
 * @lc app=leetcode.cn id=73 lang=java
 *
 * [73] 矩阵置零
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean flagcol0 = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) flagcol0 = true;
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) matrix[0][j] = matrix[i][0] = 0;
            }
        }
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[0].length - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
            if (flagcol0) matrix[i][0] = 0;
        }
    }
}
// @lc code=end

