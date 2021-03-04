#
# @lc app=leetcode.cn id=63 lang=python
#
# [63] 不同路径 II
#

# @lc code=start
class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        """
        :type obstacleGrid: List[List[int]]
        :rtype: int
        """
        n = len(obstacleGrid)
        m = len(obstacleGrid[0])
        dp = [0 for _ in range(m)]
        dp[0] = 1 if obstacleGrid[0][0] == 0 else 0
        for i in range(n):
            for j in range(m):
                if obstacleGrid[i][j] == 1:
                    dp[j] = 0
                    continue
                if j > 0:
                    dp[j] += dp[j - 1]
        return dp[-1]
# @lc code=end

