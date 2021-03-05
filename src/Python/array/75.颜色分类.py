#
# @lc app=leetcode.cn id=75 lang=python
#
# [75] 颜色分类
#

# @lc code=start
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        p0 = 0
        p2 = len(nums) - 1
        # double pointer
        for i in range(p2 + 1):
            # swap untill it does not equal to 2
            while i <= p2 and nums[i] == 2:
                nums[i], nums[p2] = nums[p2], nums[i]
                p2 -= 1
            if nums[i] == 0:
                nums[i], nums[p0] = nums[p0], nums[i]
                p0 += 1
# @lc code=end

