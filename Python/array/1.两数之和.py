#
# @lc app=leetcode.cn id=1 lang=python
#
# [1] 两数之和
#

# @lc code=start
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashMap = dict()
        for index, value in enumerate(nums):
            if value in hashMap:
                return [hashMap[value], index]
            else:
                hashMap[target - value] = index 
# @lc code=end

