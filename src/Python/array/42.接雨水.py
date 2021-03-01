#
# @lc app=leetcode.cn id=42 lang=python
#
# [42] 接雨水
#

# @lc code=start
class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if height == None or len(height) == 0:
            return 0
        length = len(height)
        ans = 0
        left_max = [0] * length
        right_max = [0] * length
        left_max[0] = height[0]
        for i in range(1, length):
            left_max[i] = max(height[i], left_max[i - 1])
        right_max[length - 1] = height[length - 1]
        for i in range(length - 2, -1, -1):
            right_max[i] = max(height[i], right_max[i + 1])
        for i in range(length):
            ans += min(left_max[i], right_max[i]) - height[i]
        return ans
# @lc code=end

