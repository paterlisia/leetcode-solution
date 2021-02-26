#
# @lc app=leetcode.cn id=26 lang=python
#
# [26] 删除排序数组中的重复项
#

# @lc code=start
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 0
        for j in range(len(nums)):
            if nums[j] != nums[i]:
                i += 1
                tmp = nums[j]
                nums[j] = nums[i]
                nums[i] = tmp
        return i + 1
# @lc code=end

