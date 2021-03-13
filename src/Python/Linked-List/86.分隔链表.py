#
# @lc app=leetcode.cn id=86 lang=python
#
# [86] 分隔链表
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def partition(self, head, x):
        """
        :type head: ListNode
        :type x: int
        :rtype: ListNode
        """
        small_list = ListNode(0)
        small = small_list
        large_list = ListNode(0)
        large = large_list
        while head:
            if head.val < x:
                small_list.next = head
                small_list = small_list.next
            else:
                large_list.next = head
                large_list = large_list.next
            head = head.next
        large_list.next = None
        small_list.next = large.next
        return small.next
# @lc code=end

