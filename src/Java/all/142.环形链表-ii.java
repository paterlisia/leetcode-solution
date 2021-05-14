/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return head;
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null)
                fast = fast.next.next;
            else return null;
            if (fast == slow) {
                ListNode pre = head;
                while (pre != slow) {
                    slow = slow.next;
                    pre = pre.next;
                }
                return pre;
            }
        }
        return null;
    }
}
// @lc code=end

