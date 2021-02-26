#
# @lc app=leetcode.cn id=34 lang=python
#
# [34] 在排序数组中查找元素的第一个和最后一个位置
#

# @lc code=start
class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        left_index = self.binarySearch(nums, target, True)
        right_index = self.binarySearch(nums, target, False) 
        if left_index <= right_index and left_index >=0 and right_index < len(nums) and nums[left_index] == nums[right_index] == target:
            return [left_index, right_index]
        return [-1, -1]

    def binarySearch(self, nums, target, lower):
        left = 0
        right = len(nums) - 1
        while left <= right:
            mid = (left + right) / 2
            if nums[mid] == target:
                if lower:
                    while mid >= 0 and nums[mid] == target:
                        mid -= 1
                    return mid + 1
                else:
                    while mid < len(nums) and nums[mid] == target:
                        mid += 1
                    return mid - 1
            if nums[mid] > target:
                right = mid - 1
            else:
                left = mid + 1
        return -1
# @lc code=end

