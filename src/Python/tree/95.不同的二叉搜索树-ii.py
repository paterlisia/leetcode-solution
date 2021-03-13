#
# @lc app=leetcode.cn id=95 lang=python
#
# [95] 不同的二叉搜索树 II
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def generateTrees(self, n):
        """
        :type n: int
        :rtype: List[TreeNode]
        """
        if n == 0:
            return []
        return self.getBinarySearchTree(1, n)
    def getBinarySearchTree(self, start, end):
        res = []
        if start > end:
            res.append(None)
            return res
        if start == end:
            res.append(TreeNode(start))
            return res
        for i in range(start, end + 1):
            leftTrees = self.getBinarySearchTree(start, i - 1)
            rightTrees = self.getBinarySearchTree(i + 1, end)
            for left in leftTrees:
                for right in rightTrees:
                    root = TreeNode(i)
                    root.left = left
                    root.right = right
                    res.append(root)
        return res
# @lc code=end

