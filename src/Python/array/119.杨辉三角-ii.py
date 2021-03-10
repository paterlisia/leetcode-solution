#
# @lc app=leetcode.cn id=119 lang=python
#
# [119] 杨辉三角 II
#

# @lc code=start
class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        level = []
        level.append(1)
        for i in range(1, rowIndex + 1):
            # from last to the first
            for j in range(i - 1, 0, -1):
                # transfer equaltion
                level[j] = (level[j - 1] + level[j])
            # boarder
            level.append(1)
        return level
# @lc code=end

