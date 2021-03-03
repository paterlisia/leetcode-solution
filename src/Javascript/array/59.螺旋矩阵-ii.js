/*
 * @lc app=leetcode.cn id=59 lang=javascript
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
/**
 * @param {number} n
 * @return {number[][]}
 */
var generateMatrix = function(n) {
    let l = 0, r = n - 1, t = 0, b = n - 1, num = 1;
    const count = n * n;
    const mat = Array.from({length: n}, () => Array(n));
    while (num <= count) {
        for (let i = l; i <= r; i++) mat[t][i] = num++;
        t++;
        for (let i = t; i <= b; i++) mat[i][r] = num++;
        r--;
        for (let i = r; i >= l; i--) mat[b][i] = num++;
        b--;
        for (let i = b; i >= t; i--) mat[i][l] = num++;
        l++;
    }
    return mat;
};
// @lc code=end

