#
# @lc app=leetcode.cn id=54 lang=python
#
# [54] 螺旋矩阵
#

# @lc code=start
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        l = 0
        b = len(matrix) - 1
        t = 0
        r = len(matrix[0]) - 1
        res = []
        count = len(matrix) * len(matrix[0])
        num = 1
        while num <= count:
            for i in range(l, r + 1):
                if num > count:
                    break
                res.append(matrix[t][i])
                num += 1
            t += 1
            for i in range(t, b + 1):
                if num > count:
                    break
                res.append(matrix[i][r])
                num += 1
            r -= 1
            for i in range(r, l - 1, -1):
                if num > count:
                    break
                res.append(matrix[b][i])
                num += 1
            b -= 1
            for i in range(b, t - 1, -1):
                if num > count:
                    break
                res.append(matrix[i][l])
                num += 1
            l += 1
        return res


# @lc code=end

