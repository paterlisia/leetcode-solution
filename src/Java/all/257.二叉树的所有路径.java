/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        backtracking(res, root, new StringBuffer());
        return res;
    }
    public void backtracking(List<String> res, TreeNode root, StringBuffer sb) {
        if (root == null) return;
        int len = sb.length();
        sb.append(root.val);
        if (root.left == null && root.right == null) res.add(sb.toString());
        else {
            sb.append("->");
            backtracking(res, root.left, sb);
            backtracking(res, root.right, sb);
        }
        sb.setLength(len);
    }
}
// @lc code=end

