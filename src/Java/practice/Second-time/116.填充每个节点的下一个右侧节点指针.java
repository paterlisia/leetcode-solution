/*
 * @lc app=leetcode.cn id=116 lang=java
 *
 * [116] 填充每个节点的下一个右侧节点指针
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return root;
        Node pre = root;
        while (root.left != null) {
            Node node = root;
            while (node != null) {
                node.left.next = node.right;
            if (node.next != null) {
                node.right.next = node.next.left;
            }
            node = node.next;
        }
        root = root.left;
        }
        return pre;
    }
}
// @lc code=end

