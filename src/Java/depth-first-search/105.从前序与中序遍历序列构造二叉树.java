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
        return recurrHelper(preorder, inorder, Integer.MIN_VALUE);
    }
    public TreeNode recurrHelper(int[] preorder, int[] inorder, int stopper) {
        if (inIdx >= inorder.length) return null;
        if (inorder[inIdx] == stopper) {
            inIdx++;
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIdx++]);
        root.left = recurrHelper(preorder, inorder, root.val);
        root.right = recurrHelper(preorder, inorder, stopper);
        return root;
    }
}
// @lc code=end

