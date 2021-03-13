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
        int len = 1;
        ListNode oldTail = head;
        while (oldTail.next != null) {
            len++;
            oldTail = oldTail.next;
        }
        // create a ring linked-list
        oldTail.next = head;
        ListNode newTail = head;
        for (int i = 0; i < len - k % len - 1; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        // break the ring
        newTail.next = null;
        return newHead;
    }
}
// @lc code=end

