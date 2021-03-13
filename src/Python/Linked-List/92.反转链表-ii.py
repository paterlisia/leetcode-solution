#
# @lc app=leetcode.cn id=92 lang=python
#
# [92] 反转链表 II
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseBetween(self, head, left, right):
        """
        :type head: ListNode
        :type left: int
        :type right: int
        :rtype: ListNode
        """
        dummy = ListNode(0)
        dummy.next = head
        pre = dummy
        end = dummy
        for i in range(left - 1):
            if end:
                end = end.next
                pre = pre.next
            else:
                break
        for i in range(right - left + 1):
            if end:
                end = end.next
            else:
                break
        start = pre.next
        next = end.next
        end.next = None
        pre.next = self.reverse(start)
        start.next = next
        return dummy.next

    def reverse(self, head):
        pre = None
        cur = head
        while cur:
            next = cur.next
            cur.next = pre
            pre = cur
            cur = next
        return pre

# @lc code=end

