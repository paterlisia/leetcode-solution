#
# @lc app=leetcode.cn id=101 lang=python
#
# [101] 对称二叉树
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return False
        return self.judge(root.left, root.right)

    def judge(self, left, right):
        if not left and not right:
            return True
        if not left:
            return False
        if not right:
            return False
        if left.val != right.val:
            return False
        return self.judge(left.left, right.right) and self.judge(left.right, right.left)

# @lc code=end

