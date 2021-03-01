#
# @lc app=leetcode.cn id=48 lang=python
#
# [48] 旋转图像
#

# @lc code=start
class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        length = len(matrix)
        for i in range(length // 2):
            for j in range(length):
                matrix[i][j], matrix[length - i - 1][j] = matrix[length - i - 1][j], matrix[i][j]
        for i in range(length):
            for j in range(i):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
# @lc code=end

