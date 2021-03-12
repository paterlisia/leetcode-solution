/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        // to make fast distant N from slow
        while ( n != 0) {
            fast = fast.next;
            n--;
        }
        // to locate the last N element
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // delete node
        slow.next = slow.next.next;
        return dummy.next;
    }
}
// @lc code=end

