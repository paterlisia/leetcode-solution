#
# @lc app=leetcode.cn id=55 lang=python
#
# [55] 跳跃游戏
#

# @lc code=start
class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        max_position = 0
        for i in range(len(nums)):
            # can not reach current position
            if i > max_position:
                return False
            max_position = max(max_position, nums[i] + i)
        return True
# @lc code=end

