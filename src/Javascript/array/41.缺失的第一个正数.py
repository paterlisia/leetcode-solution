#
# @lc app=leetcode.cn id=41 lang=python
#
# [41] 缺失的第一个正数
#

# @lc code=start
class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = len(nums)
        for i in range(length):
            while 0 < nums[i] <= length and nums[nums[i] - 1] != nums[i]:
                nums[nums[i] - 1], nums[i] = nums[i], nums[nums[i] - 1]
        for i in range(length):
            if nums[i] != i + 1:
                return i + 1
        return length + 1
# @lc code=end

