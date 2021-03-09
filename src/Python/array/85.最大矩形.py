#
# @lc app=leetcode.cn id=85 lang=python
#
# [85] 最大矩形
#

# @lc code=start
class Solution(object):
    def maximalRectangle(self, matrix):
        """
        :type matrix: List[List[str]]
        :rtype: int
        """
        if len(matrix) == 0: return 0
        # to make the last element of heights array can be calculated
        heights = [0] * (len(matrix[0]) + 1)
        res = 0
        for i in range(len(matrix)):
            stack = []
            heights[len(matrix[0])] = 0
            # get the heights array
            for j in range(len(matrix[0]) + 1):
                if j < len(matrix[0]):
                    if matrix[i][j] == '1':
                        heights[j] += 1
                    else:
                        heights[j] = 0
                # problem 85 (transfer to count max rectangular row by row)
                while stack and heights[j] < heights[stack[-1]]:
                    cur = stack.pop()
                    leftMin = stack[-1] if stack else -1
                    res = max(res, (j - leftMin - 1) * heights[cur])
                stack.append(j)
        return res
# @lc code=end

