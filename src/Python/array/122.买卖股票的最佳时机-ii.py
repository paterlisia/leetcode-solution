#
# @lc app=leetcode.cn id=122 lang=python
#
# [122] 买卖股票的最佳时机 II
#

# @lc code=start
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        maxPro = 0
        for i in range(1, len(prices)):
            maxPro += max(0, prices[i] - prices[i - 1])
        return maxPro
# @lc code=end

