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
        ListNode slow = head, fast = head;
        // middle point
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // break the list
        ListNode latterHead = slow.next;
        slow.next = null;
        // reverse the latter one
        ListNode newHead = reverse(latterHead);
        // sort the two lists
        while (newHead != null) {
            ListNode tmpHead = newHead.next;
            newHead.next = head.next;
            head.next = newHead;
            head = newHead.next;
            newHead = tmpHead;
        }
    }
    public ListNode reverse(ListNode start) {
        if (start == null) return null;
        ListNode dummy = start;
        start = start.next;
        dummy.next = null;
        while (start != null) {
            ListNode next = start.next;
            start.next = dummy;
            dummy = start;
            start = next;
        }
        return dummy;

    }
}
// @lc code=end

