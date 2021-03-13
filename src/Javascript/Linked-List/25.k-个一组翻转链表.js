/*
 * @lc app=leetcode.cn id=25 lang=javascript
 *
 * [25] K 个一组翻转链表
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
var reverseKGroup = function(head, k) {
    const dummy = new ListNode(0);
    dummy.next = head;
    let pre = dummy, end = dummy;
    while (end.next != null) {
        for (let i = 0; i < k && end != null; i++) end = end.next;
        // length lower than k
        if (end == null) break;
        // start of reverse
        let start = pre.next;
        // next node of end of reverse
        let next = end.next;
        // cut off lists
        end.next = null;
        // reverse k nodes
        pre.next = reverseList(start);
        start.next = next;
        pre = start;
        end = pre;
    }
    return dummy.next;
};
const reverseList = (head) => {
    let pre = null
    let curr = head
    while (curr != null) {
        let next = curr.next;
        curr.next = pre;
        pre = curr;
        curr = next;
    }
    return pre;
}
// @lc code=end

