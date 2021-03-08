#
# @lc app=leetcode.cn id=84 lang=python
#
# [84] 柱状图中最大的矩形
#

# @lc code=start
class Solution(object):
    def largestRectangleArea(self, heights):
        """
        :type heights: List[int]
        :rtype: int
        """
        stack = []
        heights = [0] + heights + [0]
        res = 0
        for i in range(len(heights)):
            while stack and heights[stack[-1]] > heights[i]:
                left_index = stack.pop()
                # heights[i] * (right_i - left_i -1)
                res = max(res, (i - stack[-1] - 1) * heights[left_index])
            stack.append(i)
        return res
# @lc code=end

