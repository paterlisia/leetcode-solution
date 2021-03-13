/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode largeList = new ListNode(0);
        ListNode largeHead = largeList;
        ListNode smallList = new ListNode(0);
        ListNode smallHead = smallList;
        while (head != null) {
            if (head.val < x) {
                smallList.next = head;
                smallList = smallList.next;
            } else {
                largeList.next = head;
                largeList = largeList.next;
            }
            head = head.next;
        }
        largeList.next = null;
        smallList.next = largeHead.next;
        return smallHead.next;
    }
}
// @lc code=end

