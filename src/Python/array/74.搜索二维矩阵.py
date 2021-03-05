#
# @lc app=leetcode.cn id=74 lang=python
#
# [74] 搜索二维矩阵
#

# @lc code=start
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        left = 0
        right = len(matrix) * len(matrix[0]) - 1
        # binary search
        while left <= right:
            mid = (left + right) // 2
            # locate element in the matrix
            midVal = matrix[mid // len(matrix[0])][mid % len(matrix[0])]
            if midVal == target: return True
            elif midVal > target: right = mid - 1
            else : left = mid + 1
        return False
# @lc code=end

