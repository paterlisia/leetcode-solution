/*
 * @lc app=leetcode.cn id=117 lang=java
 *
 * [117] 填充每个节点的下一个右侧节点指针 II
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
    Node last, nextStart;
    public Node connect(Node root) {
        if (root == null) return root;
        Node start = root;
        while (start != null) {
            last = null;
            nextStart = null;
            for (Node p = start; p != null; p = p.next) {
                if (p.left != null) handle(p.left);
                if (p.right != null) handle(p.right);
            }
            start = nextStart;
        }
        return root;
    }

    public void handle(Node p) {
        if (last != null) last.next = p;
        if (nextStart == null) nextStart = p;
        last = p;
    }
}
// @lc code=end

