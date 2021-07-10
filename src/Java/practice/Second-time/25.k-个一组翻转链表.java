/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, end = dummy;
        while ( end.next != null) {
            int num = k;
            while (end != null && num > 0) {
                end = end.next;
                num--;
            }
            if (end == null) return dummy.next;
            ListNode newStart = end.next, start = pre.next;
            end.next = null;
            pre.next = null;
            pre.next = reverse(start);
            start.next = newStart;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode start) {
        ListNode pre = null;
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

