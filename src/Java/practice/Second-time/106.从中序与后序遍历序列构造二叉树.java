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
    int poIdx, inIdx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        poIdx = postorder.length - 1;
        inIdx = inorder.length - 1;
        return recurr(inorder, postorder, Integer.MAX_VALUE);
    }
    public TreeNode recurr(int[] inorder, int[] postorder, int stop) {
        if (poIdx < 0) {
            return null;
        }
        if (inorder[inIdx] == stop) {
            inIdx--;
            return null;
        }
        TreeNode root = new TreeNode(postorder[poIdx--]);
        root.right = recurr(inorder, postorder, root.val);
        root.left = recurr(inorder, postorder, stop);
        return root;
    }
}
// @lc code=end

