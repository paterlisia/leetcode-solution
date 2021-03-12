#
# @lc app=leetcode.cn id=2 lang=python
#
# [2] 两数相加
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        head = pre = ListNode(0)
        carry = 0
        while l1 or l2 or carry > 0:
            # save sum
            val = carry
            if l1: l1, val = l1.next, val + l1.val
            if l2: l2, val = l2.next, val + l2.val

            carry, val = divmod(val, 10)
            pre.next = ListNode(val)
            pre = pre.next
        return head.next
# @lc code=end

