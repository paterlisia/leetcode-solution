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
        ListNode node = head;
        int len = 1;
        while (node.next != null) {
            len++;
            node = node.next;
        }
        node.next = head;
        for (int i = 0; i < len - k % len; i++) {
            node = node.next;
        }
        ListNode newHead = node.next;
        node.next = null;
        return newHead;
    }
}
// @lc code=end

