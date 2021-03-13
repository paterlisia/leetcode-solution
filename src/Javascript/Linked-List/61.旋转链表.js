/*
 * @lc app=leetcode.cn id=61 lang=javascript
 *
 * [61] 旋转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var rotateRight = function(head, k) {
    if (head === null || head.next === null) return head;
    let oldTail = head;
    let len = 1;
    while (oldTail.next !== null) {
        oldTail = oldTail.next;
        len++;
    }
    oldTail.next = head;
    let newTail = head;
    for (let i = 0; i < len - k % len - 1; i++) {
        newTail = newTail.next;
    }
    const newHead = newTail.next;
    // breack the ring
    newTail.next = null;
    return newHead;
};
// @lc code=end

