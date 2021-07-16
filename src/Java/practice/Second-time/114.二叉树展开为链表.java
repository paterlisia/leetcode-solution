/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
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
    public void flatten(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                TreeNode nextNode = cur.left;
                TreeNode nextPrecussor = nextNode;
                while (nextPrecussor.right != null) nextPrecussor = nextPrecussor.right;
                nextPrecussor.right = cur.right;
                cur.left = null;
                cur.right = nextNode;
            }
            cur = cur.right;
        }
    }
}
// @lc code=end

