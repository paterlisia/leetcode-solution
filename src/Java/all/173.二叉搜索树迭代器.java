/*
 * @lc app=leetcode.cn id=173 lang=java
 *
 * [173] 二叉搜索树迭代器
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    TreeNode node;
    Stack<TreeNode> s;
    public BSTIterator(TreeNode root) {
        node = root;
        s = new Stack<TreeNode>();
    }
    
    public int next() {
        while (node != null) {
            s.push(node);
            node = node.left;
        }
        node = s.pop();
        int res = node.val;
        node = node.right;
        return res;
    }
    
    public boolean hasNext() {
        return node != null || !s.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end

