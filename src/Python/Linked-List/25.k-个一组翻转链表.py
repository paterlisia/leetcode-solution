#
# @lc app=leetcode.cn id=25 lang=python
#
# [25] K 个一组翻转链表
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseKGroup(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        dummy = ListNode(0)
        dummy.next = head
        pre = dummy
        end = dummy
        while end:
            for i in range(k):
                if end:
                    end = end.next
                else:
                    break
            if not end: break
            start = pre.next
            next = end.next
            end.next = None
            pre.next = self.reverse(start)
            start.next = next
            pre = start
            end = pre
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

