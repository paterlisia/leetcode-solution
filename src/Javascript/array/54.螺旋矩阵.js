/*
 * @lc app=leetcode.cn id=54 lang=javascript
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    let l = 0, t = 0, r = matrix[0].length - 1, b = matrix.length - 1;
    const res = [], count = matrix.length * matrix[0].length;
    let num = 1;
    while (num <= count) {
        for (let i = l; i <= r && num <= count; i++) {
            res.push(matrix[t][i]);
            num++;
        }
        t++;
        for (let i = t; i <= b && num <= count; i++) {
            res.push(matrix[i][r]);
            num++;
        }
        r--;
        for (let i = r; i >= l && num <= count; i--) {
            res.push(matrix[b][i]);
            num++;
        }
        b--;
        for (let i = b; i >= t && num <= count; i--) {
            res.push(matrix[i][l]);
            num++;
        }
        l++;
    }
    return res;
};
// @lc code=end

