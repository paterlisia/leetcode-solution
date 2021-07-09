/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = new ListNode(0);
        cur.next = head;
        ListNode dummy = cur;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val ) {
                int tmp = cur.next.val;
                while (cur.next != null && tmp == cur.next.val) cur.next = cur.next.next;
            } else cur = cur.next;
        }
        return dummy.next;
    }
}
// @lc code=end

