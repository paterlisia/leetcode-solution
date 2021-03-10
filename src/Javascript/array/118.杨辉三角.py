#
# @lc app=leetcode.cn id=118 lang=python
#
# [118] 杨辉三角
#

# @lc code=start
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        res = []
        for i in range(numRows):
            level = []
            for j in range(i + 1):
                if j == 0 or j == i:
                    level.append(1)
                else:
                    level.append(res[i - 1][j - 1] + res[i - 1][j])
        return res
# @lc code=end

