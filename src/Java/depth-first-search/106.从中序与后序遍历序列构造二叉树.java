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
        return recurrHelper(inorder, postorder, Integer.MIN_VALUE);
    }
    public TreeNode recurrHelper(int[] inorder, int[] postorder, int stopper) {
        if (inIdx == -1) return null;
        if (inorder[inIdx] == stopper) {
            inIdx--;
            return null;
        }
        TreeNode root = new TreeNode(postorder[poIdx--]);
        root.right = recurrHelper(inorder, postorder, root.val);
        root.left = recurrHelper(inorder, postorder, stopper);
        return root;
    }
}
// @lc code=end

