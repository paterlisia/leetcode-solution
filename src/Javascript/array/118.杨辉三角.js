/*
 * @lc app=leetcode.cn id=118 lang=javascript
 *
 * [118] 杨辉三角
 */

// @lc code=start
/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function (numRows) {
    const res = [];
    for (let i = 0; i < numRows; i++) {
        const level = [];
        for (let j = 0; j < i + 1; j++) {
            if (j === 0 || j === i) level.push(1);
            else level.push(res[i - 1][j - 1] + res[i - 1][j]);
        }
        res.push(level);
    }
    return res;
};
// @lc code=end

