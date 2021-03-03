#
# @lc app=leetcode.cn id=56 lang=python
#
# [56] 合并区间
#

# @lc code=start
class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        res = []
        # sort intervals by lambda statement
        intervals.sort(key=lambda x: x[0])
        for interval in intervals:
            # if have not added interval or not overlapped
            # then append it anyway
            if not res or res[-1][1] < interval[0]:
                res.append(interval)
            else:
                res[-1][1] = max(res[-1][1], interval[1])
        return res
# @lc code=end

