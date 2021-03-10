/*
 * @lc app=leetcode.cn id=119 lang=javascript
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
/**
 * @param {number} rowIndex
 * @return {number[]}
 */
var getRow = function(rowIndex) {
    const level = [];
    // first element
    level.push(1);
    for (let i = 1; i <= rowIndex; i++) {
        for (let j = i - 1; j > 0; j--) {
            level[j] += level[j - 1];
        }
        level.push(1);
    }
    return level;
};
// @lc code=end

