/*
 * @lc app=leetcode.cn id=121 lang=javascript
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxPro = 0, minInput = 10000;
    for (let price of prices) {
        minInput = Math.min(price, minInput);
        maxPro = Math.max(maxPro, (price - minInput));
    }
    return maxPro;
};
// @lc code=end

