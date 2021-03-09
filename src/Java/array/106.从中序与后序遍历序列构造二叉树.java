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
        return recurrHelper(inorder, postorder, Integer.MIN_VALUE);
    }
    public TreeNode recurrHelper(int[] inorder, int[] postorder, int stop) {
        // end loop
        if (poIdx < 0) return null;
        // current loop of subTree has been finished
        if (stop == inorder[inIdx]) {
            inIdx--;
            return null;
        }
        // root node is the last element in postorder
        TreeNode root = new TreeNode(postorder[poIdx--]);
        // stopper in right subTree is the root node
        root.right = recurrHelper(inorder, postorder, root.val);
        // stopper in left subTree is the stopper of current tree
        root.left = recurrHelper(inorder, postorder, stop);
        return root;
    }
}
// @lc code=end

