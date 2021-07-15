/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
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
    int preIdx, inIdx;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIdx = 0;
        inIdx = 0;
        return recurr(preorder, inorder, Integer.MAX_VALUE);
    }
    public TreeNode recurr (int[] preorder, int[] inorder, int stop) {
        if (preIdx == preorder.length) {
            return null;
        }
        if (inorder[inIdx] == stop) {
            inIdx++;
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIdx++]);
        root.left = recurr(preorder, inorder, root.val);
        root.right = recurr(preorder, inorder, stop);
        return root;
    }
}
// @lc code=end

