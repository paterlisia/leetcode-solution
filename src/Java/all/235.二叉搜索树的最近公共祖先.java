/*
 * @lc app=leetcode.cn id=235 lang=java
 *
 * [235] 二叉搜索树的最近公共祖先
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancester = root;
        while (true) {
            if (ancester.val < p.val && ancester.val < q.val) ancester = ancester.right;
            if (ancester.val > p.val && ancester.val > q.val) ancester = ancester.left;
            else break;
        }
        return ancester;
    }
}
// @lc code=end

