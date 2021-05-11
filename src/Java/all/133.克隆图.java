/*
 * @lc app=leetcode.cn id=133 lang=java
 *
 * [133] 克隆图
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node, Node> visited = new HashMap<Node, Node>();
    public Node cloneGraph(Node node) {
        if (node == null) return node;
        if (visited.containsKey(node)) return visited.get(node);
        Node clonedNode = new Node(node.val, new ArrayList<Node>());
        visited.put(node, clonedNode);
        for (Node neighbor: node.neighbors) {
            clonedNode.neighbors.add(cloneGraph(neighbor));
        }
        return clonedNode;
    }
}
// @lc code=end

