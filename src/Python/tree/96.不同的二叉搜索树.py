#
# @lc app=leetcode.cn id=96 lang=python
#
# [96] 不同的二叉搜索树
#

# @lc code=start
class Solution(object):
    def numTrees(self, n):
        """
        :type n: int
        :rtype: int
        """
        num = [0]*(n + 1)
        num[0] = 1
        num[1] = 1
        for i in range(2, n + 1):
            for j in range(1, i + 1):
                num[i] += num[j - 1] * num[i - j]
        return num[n]
# @lc code=end

