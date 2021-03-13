/*
 * @lc app=leetcode.cn id=92 lang=javascript
 *
 * [92] 反转链表 II
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
 * @param {number} left
 * @param {number} right
 * @return {ListNode}
 */
var reverseBetween = function(head, left, right) {
    let dummy = new ListNode(0);
    dummy.next = head;
    let start = dummy, end = dummy;
    for (let i = 0; i < left - 1 && end != null; i++) {
        end = end.next;
        start = start.next;
    }
    const pre = start;
    start = start.next;
    for (let i = 0; i < right - left + 1 && end != null; i++) {
        end = end.next;
    }
    const next = end.next;
    end.next = null;
    pre.next = reverse(start);
    start.next = next;
    return dummy.next;
};
const reverse = (head) => {
    let pre = null;
    let cur = head;
    while (cur != null) {
        let next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
    }
    return pre;
}
// @lc code=end

