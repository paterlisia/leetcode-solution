#
# @lc app=leetcode.cn id=61 lang=python
#
# [61] 旋转链表
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        if not head or not head.next:
            return head
        length = 1
        oldTail = head
        while oldTail.next:
            oldTail = oldTail.next
            length += 1
        newTail = head
        oldTail.next = head
        for _ in range(length - k % length - 1):
            newTail = newTail.next
        newHead = newTail.next
        newTail.next = None
        return newHead
# @lc code=end

