/*
 * @lc app=leetcode.cn id=2 lang=javascript
 *
 * [2] 两数相加
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
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let head = new ListNode(0);
    let pre = head;
    let carry = 0;
    while (l1 !== null || l2 !== null || carry !== 0) {
        const num1 = l1 === null ? 0 : l1.val
        const num2 = l2 === null ? 0 : l2.val;
        const sum = num1 + num2 + carry;
        carry = Math.floor(sum / 10);
        pre.next = new ListNode(sum % 10);
        pre = pre.next;
        l1 = l1 === null? null : l1.next;
        l2 = l2 === null? null : l2.next;
    }
    return head.next;
};
// @lc code=end

