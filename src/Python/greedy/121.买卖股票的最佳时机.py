#
# @lc app=leetcode.cn id=121 lang=python
#
# [121] 买卖股票的最佳时机
#

# @lc code=start
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        maxPro = 0
        minPri = 10000
        for price in prices:
            minPri = min(minPri, price)
            maxPro = max(maxPro, price - minPri)
        return maxPro
# @lc code=end

