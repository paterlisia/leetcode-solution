/*
 * @lc app=leetcode.cn id=63 lang=javascript
 *
 * [63] 不同路径 II
 */

// @lc code=start
/**
 * @param {number[][]} obstacleGrid
 * @return {number}
 */
var uniquePathsWithObstacles = function(obstacleGrid) {
    const n = obstacleGrid.length, m = obstacleGrid[0].length;
    const dp = Array(m).fill(0);
    // judge if there is an obstacle at first
    dp[0] = obstacleGrid[0][0]=== 0? 1 : 0;
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < m; j++) {
            // if the current position is an obstacle
            if (obstacleGrid[i][j] === 1) {
                dp[j] = 0;
                continue;
            }
            // dp transformation equaltion
            if (j >= 1) {
                dp[j] += dp[j - 1];
            }
        }
    }
    return dp[m - 1];
};
// @lc code=end

