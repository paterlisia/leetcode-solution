#
# @lc app=leetcode.cn id=120 lang=python
#
# [120] 三角形最小路径和
#

# @lc code=start
class Solution(object):
    def minimumTotal(self, triangle):
        """
        :type triangle: List[List[int]]
        :rtype: int
        """
        level = triangle[len(triangle) - 1]
        for i in range(len(triangle) - 2, -1, -1):
            for j in range(i + 1):
                level[j] = min(level[j], level[j + 1]) + triangle[i][j]
        return level[0]
# @lc code=end

