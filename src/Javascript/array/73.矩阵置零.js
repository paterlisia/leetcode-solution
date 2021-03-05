/*
 * @lc app=leetcode.cn id=73 lang=javascript
 *
 * [73] 矩阵置零
 */

// @lc code=start
/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {
    const row = matrix.length, col = matrix[0].length;
    let colFlag0 = false;
    for (let i = 0; i < row; i++) {
        if (matrix[i][0] === 0) colFlag0 = true;
        // ! start from 1 as first column is a guidance
        for (let j = 1; j < col; j++) {
            // set first col/row to zero if there is 0 in current col/row
            if (matrix[i][j] === 0) matrix[i][0] = matrix[0][j] = 0;
        }
    }

    // from end to start becasue first row is as a guidance, other element will be infulenced
    // if the first row is set to zero due to matrix[0][0] = 0
    for (let i = row - 1; i >= 0; i--) {
        for (let j = col - 1; j > 0; j--) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
        }
        if (colFlag0) matrix[i][0] = 0;
    }
};
// @lc code=end

