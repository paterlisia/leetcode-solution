/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode rightHead = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);
        ListNode newHead = new ListNode(0);
        ListNode res= newHead;
        while (left != null && right != null) {
            if (left.val < right.val) {
                newHead.next = left;
                left = left.next;
            } else {
                newHead.next = right;
                right = right.next;
            }
            newHead = newHead.next;
        }
        newHead.next = left == null ? right : left;
        return res.next;
    }
}
// @lc code=end

