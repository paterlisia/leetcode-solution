#
# @lc app=leetcode.cn id=94 lang=python
#
# [94] 二叉树的中序遍历
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if not root: return []
        in_order = []
        return self.inorder(root, in_order)

    def inorder(self, root, res):
        if not root: return
        self.inorder(root.left, res)
        res.append(root.val)
        self.inorder(root.right, res)
        return res
# @lc code=end

