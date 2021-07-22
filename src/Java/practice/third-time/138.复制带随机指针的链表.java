/*
 * @lc app=leetcode.cn id=138 lang=java
 *
 * [138] 复制带随机指针的链表
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node, Node> map = new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        if (map.containsKey(head)) return map.get(head);
        Node copiedNode = new Node(head.val);
        map.put(head, copiedNode);
        copiedNode.next = copyRandomList(head.next);
        copiedNode.random = copyRandomList(head.random);
        return copiedNode;
    }
}
// @lc code=end

