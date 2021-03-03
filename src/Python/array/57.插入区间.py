#
# @lc app=leetcode.cn id=57 lang=python
#
# [57] 插入区间
#

# @lc code=start
class Solution(object):
    def insert(self, intervals, newInterval):
        """
        :type intervals: List[List[int]]
        :type newInterval: List[int]
        :rtype: List[List[int]]
        """
        left, right = newInterval
        ans = list()
        for li, ri in intervals:
            # judge if it overlapped
            if (left > ri or right < li):
                ans.append([li, ri])
            else:
                # combine intervals
                left = min(left, li)
                right = max(right, ri)
        ans.append([left, right])
        ans.sort(key=lambda x: x[0])
        return ans
# @lc code=end

