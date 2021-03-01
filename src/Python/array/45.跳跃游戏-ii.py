#
# @lc app=leetcode.cn id=45 lang=python
#
# [45] 跳跃游戏 II
#

# @lc code=start
class Solution(object):
    def jump(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        end = 0
        ans = 0
        maxPosition = 0
        for i in range(len(nums) - 1):
            maxPosition = max(nums[i] + i, maxPosition)
            if (end == i):
                ans += 1
                end = maxPosition
        return ans
# @lc code=end

