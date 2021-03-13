/*
 * @lc app=leetcode.cn id=96 lang=javascript
 *
 * [96] 不同的二叉搜索树
 */

// @lc code=start
/**
 * @param {number} n
 * @return {number}
 */
var numTrees = function(n) {
    const nums = Array(n + 1).fill(0);
    nums[0] = 1;
    nums[1] = 1;
    for (let i = 2; i <= n; i++) {
        for (let j = 1; j <= i; j++) {
            nums[i] += nums[j - 1] * nums[i - j];
        }
    }
    return nums[n];
};
// @lc code=end

