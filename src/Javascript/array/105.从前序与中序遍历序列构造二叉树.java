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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return recurrHelper(0, 0, inorder.length - 1, preorder, inorder);
    }
    public TreeNode recurrHelper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) return null;
        // root node is the first element of preorder
        TreeNode root = new TreeNode(preorder[preStart]);
        // position of root node in inOrder
        int index = inStart;
        while (index < inEnd && inorder[index] != root.val) index++;
        root.left = recurrHelper(preStart + 1, inStart, index - 1, preorder, inorder);
        root.right = recurrHelper(preStart + index - inStart + 1, index + 1, inEnd, preorder, inorder);
        return root;
    }
}
// @lc code=end

