/*
 * @lc app=leetcode.cn id=141 lang=javascript
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    if (head === null || head.next === null) return false;
    let slow = head, fast = head.next;
    while (slow !== fast) {
        if (fast === null || fast.next === null) return false;
        slow = slow.next;
        fast = fast.next.next;
    }
    return true;
};
// @lc code=end

