/*
 * @lc app=leetcode.cn id=120 lang=javascript
 *
 * [120] 三角形最小路径和
 */

// @lc code=start
/**
 * @param {number[][]} triangle
 * @return {number}
 */
var minimumTotal = function(triangle) {
    const level = triangle[triangle.length - 1];
    for (let i = triangle.length - 2; i >= 0; i--) {
        for (let j = 0; j <= i; j++) {
            level[j] = Math.min(level[j], level[j + 1]) + triangle[i][j];
        }
    }
    return level[0];
};
// @lc code=end

