/*
 * @lc app=leetcode.cn id=147 lang=java
 *
 * [147] 对链表进行插入排序
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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode lastSorted = head, cur = head.next;
        while (cur != null) {
            if (cur.val < lastSorted.val) {
                ListNode pre = dummyHead;
                while (pre.next.val < cur.val) pre = pre.next;
                lastSorted.next = cur.next;
                cur.next = pre.next;
                pre.next = cur;
            } else {
                lastSorted = lastSorted.next;
            }
            cur = lastSorted.next;
        }
        return dummyHead.next;
    }
}
// @lc code=end

