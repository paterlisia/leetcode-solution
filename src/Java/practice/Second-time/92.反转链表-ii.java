/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (left > 1) {
            left--;
            right--;
            pre = pre.next;
        }
        ListNode start = pre.next, end = pre.next;
        while (right > 1) {
            right--;
            end = end.next;
        }
        pre.next = null;
        ListNode next = end.next;
        end.next = null;
        pre.next = reverse(start);
        start.next = next;
        return dummy.next;
    }
    public ListNode reverse (ListNode start) {
        ListNode pre = new ListNode(0);
        while (start != null) {
            ListNode next = start.next;
            start.next = pre;
            pre = start;
            start = next;
        }
        return pre;
    }
}
// @lc code=end

