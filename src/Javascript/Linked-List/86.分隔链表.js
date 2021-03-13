/*
 * @lc app=leetcode.cn id=86 lang=javascript
 *
 * [86] 分隔链表
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
 * @param {number} x
 * @return {ListNode}
 */
var partition = function(head, x) {
    let largeList = new ListNode(0);
    let large = largeList;
    let smallList = new ListNode(0);
    let small = smallList;
    while (head != null) {
        if (head.val < x) {
            smallList.next = head;
            smallList = smallList.next;
        } else {
            largeList.next = head;
            largeList = largeList.next;
        }
        head = head.next;
    }
    largeList.next = null;
    smallList.next = large.next;
    return small.next;
};
// @lc code=end

