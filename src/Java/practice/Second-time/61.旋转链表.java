/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode pre = new ListNode(1), cur = head;
        pre.next = head;
        int len = 1;
        while (cur.next != null) {
            cur = cur.next;
            len++;
        }
        for (int i = 0; i < len - k % len; i++) {
            pre = pre.next;
        }
        ListNode newHead = pre.next;
        pre.next = null;
        cur.next = head;
        return newHead;
    }
}
// @lc code=end

