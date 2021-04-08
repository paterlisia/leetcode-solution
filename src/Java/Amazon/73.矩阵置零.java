/*
 * @lc app=leetcode.cn id=73 lang=java
 *
 * [73] 矩阵置零
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        boolean colFlag0 = false;
        for (int i = 0; i < row; i++) {
            // set flag to represent if there is a 0 in the first column
            if (matrix[i][0] == 0) colFlag0 = true;
            // ! start from 1 as first column is a guidance
            for (int j = 1; j < col; j++) {
                // set 0 in corresponding col[0] and row[0] to represent there is a zero in the col/row
                if (matrix[i][j] == 0) matrix[i][0] = matrix[0][j] = 0;
            }
        }
        // from end to start becasue first row is as a guidance, other element will be infulenced
        // if the first row is set to zero due to matrix[0][0] = 0
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 1; j--) {
                // set 0 in corresponding col[0] and row[0] to represent there is a zero in the col/row
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
            if (colFlag0) matrix[i][0] = 0;
        }
    }
}
// @lc code=end

