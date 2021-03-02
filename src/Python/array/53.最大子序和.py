#
# @lc app=leetcode.cn id=53 lang=python
#
# [53] 最大子序和
#

# @lc code=start
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_sum = nums[0]
        pre = 0
        for i in range(len(nums)):
            pre = max(nums[i] + pre, nums[i])
            max_sum = max(max_sum, pre)
        return max_sum
# @lc code=end

