#
# @lc app=leetcode.cn id=73 lang=python
#
# [73] 矩阵置零
#

# @lc code=start
class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        # using first column and row to represent if there is 0 in current col/row
        row = len(matrix)
        col = len(matrix[0])
        col_flag0 = False
        for i in range(row):
            # set flag to represent if there is a 0 in the first column
            if matrix[i][0] == 0: col_flag0 = True
            for j in range(1, col):
                # set first col/row to zero if there is 0 in current col/row
                if matrix[i][j] == 0: 
                    matrix[i][0] = matrix[0][j] = 0
        # from end to start becasue first row is as a guidance, other element will be infulenced
        # if the first row is set to zero due to matrix[0][0] = 0
        for i in range(row - 1, -1, -1):
            for j in range(col - 1, 0, -1):
                if matrix[i][0] == 0 or matrix[0][j] == 0:
                    matrix[i][j] = 0
            if col_flag0: matrix[i][0] = 0

# @lc code=end

