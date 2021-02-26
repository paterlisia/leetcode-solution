#
# @lc app=leetcode.cn id=33 lang=python
#
# [33] 搜索旋转排序数组
#

# @lc code=start
import math
class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        left = 0
        right = len(nums) - 1
        max_value = math.pow(10, 4)
        while left <= right:
            mid = (left + right) / 2
            if nums[mid] == target:
                return mid
            # judge target locate at which side of the array
            if nums[0] <= target:
                # judge mid locate at which side of the array
                if nums[mid] < nums[0]:
                    nums[mid] = max_value
            else:
                if nums[mid] >= nums[0]:
                    nums[mid] = -max_value
            if nums[mid] > target:
                right = mid - 1
            else:
                left = mid + 1
        return -1

# @lc code=end
