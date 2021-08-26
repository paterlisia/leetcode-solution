/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    ListNode frontNode;
    public boolean isPalindrome(ListNode head) {
        frontNode = head;
        return recurr(head);
    }
    public boolean recurr(ListNode currentNode) {
        if (currentNode != null) {
            if (!recurr(currentNode.next)) return false;
            if (currentNode.val != frontNode.val) return false;
            frontNode = frontNode.next;
        }
        return true;
    }
}
// @lc code=end

