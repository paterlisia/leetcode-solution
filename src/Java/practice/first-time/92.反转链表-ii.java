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
        ListNode slow = dummy, fast = dummy;
        // locate left
        while (left > 1) {
            slow = slow.next;
            left--;
        }
        // locate right
        while (right > 0) {
            fast = fast.next;
            right--;
        }
        ListNode cur = slow.next, pre = fast.next;
        // break the target linked-list
        slow.next = null;
        fast.next = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        slow.next = pre;
        return dummy.next;
    }
}
// @lc code=end

