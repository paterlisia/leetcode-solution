/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode node = pre;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                node.next = l2;
                l2 = l2.next;
                node = node.next;
            } else if (l2 == null) {
                node.next = l1;
                l1 = l1.next;
                node = node.next;
            } else {
                if (l1.val > l2.val) {
                    node.next = l2;
                    l2 = l2.next;
                    node = node.next;
                } else {
                    node.next = l1;
                    l1 = l1.next;
                    node = node.next;
                }
            }
        }
        return pre.next;
    }
}
// @lc code=end

