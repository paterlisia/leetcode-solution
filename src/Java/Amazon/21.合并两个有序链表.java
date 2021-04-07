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
        ListNode node1 = l1, node2 = l2;
        ListNode dummy = new ListNode();
        ListNode node = dummy;
        while (node1 != null || node2 != null) {
            if (node1 == null) {
                node.next = node2;
                node2 = node2.next;
            } else if (node2 == null) {
                node.next = node1;
                node1 = node1.next;
            } else {
                if (node1.val > node2.val) {
                    node.next = node2;
                    node2 = node2.next;
                } else {
                    node.next = node1;
                    node1 = node1.next;
                }
            }
            node = node.next;
        }
        return dummy.next;
    }
}
// @lc code=end

