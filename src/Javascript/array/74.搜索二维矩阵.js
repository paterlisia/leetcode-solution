/*
 * @lc app=leetcode.cn id=74 lang=javascript
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    let left = 0, right = matrix.length * matrix[0].length - 1;
    // binary search
    while (left <= right) {
        const mid = Math.floor((left + right) / 2);
        // convert number to index
        const midVal = matrix[Math.floor(mid / matrix[0].length)][Math.floor(mid % matrix[0].length)];
        if (midVal === target) return true;
        else if (midVal > target) right = mid - 1;
        else left = mid + 1;
    }
    return false;
};
// @lc code=end

