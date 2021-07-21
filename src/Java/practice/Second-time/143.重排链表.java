/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
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
    public void reorderList(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode rightHead = slow.next;
        slow.next = null;
        ListNode newHead = reverse(rightHead);
        ListNode sorted = head;
        while (newHead != null) {
            ListNode newHeadNext = newHead.next;
            newHead.next = sorted.next;
            sorted.next = newHead;
            sorted = newHead.next;
            newHead = newHeadNext;
        }
    }
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = pre;
            pre = head;
            head = nextNode;
        }
        return pre;
    }
}
// @lc code=end

