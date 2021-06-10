/*
 * @lc app=leetcode.cn id=106 lang=java
 *
 * [106] 从中序与后序遍历序列构造二叉树
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
class Solution {
    int inIdx, poIdx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inIdx = inorder.length - 1;
        poIdx = postorder.length - 1;
        return dfs(inorder, postorder, Integer.MAX_VALUE);
    }
    public TreeNode dfs(int[] inorder, int[] postorder, int stopper) {
        if (inIdx < 0) return null;
        if (inorder[inIdx] == stopper) {
            inIdx--;
            return null;
        }
        TreeNode root = new TreeNode(postorder[poIdx--]);
        root.right = dfs(inorder, postorder, root.val);
        root.left = dfs(inorder, postorder, stopper);
        return root;
    }
}
// @lc code=end

