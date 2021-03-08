#
# @lc app=leetcode.cn id=78 lang=python
#
# [78] 子集
#

# @lc code=start
class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        # dfs
        def helper(start, path):
            res.append(path)
            for i in range(start, len(nums)):
                helper(i + 1, path + [nums[i]])
        helper(0, [])
        return res
# @lc code=end

