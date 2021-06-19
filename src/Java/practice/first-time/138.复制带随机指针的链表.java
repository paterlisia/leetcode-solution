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
    HashMap<Node, Node> visited = new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        if (visited.containsKey(head)) return visited.get(head);
        Node copyNode = new Node(head.val);
        visited.put(head, copyNode);
        copyNode.next = copyRandomList(head.next);
        copyNode.random = copyRandomList(head.random);
        return copyNode;
    }
}
// @lc code=end

