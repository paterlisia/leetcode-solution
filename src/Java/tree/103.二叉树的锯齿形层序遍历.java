/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层序遍历
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        Deque<TreeNode> q = new ArrayDeque<TreeNode>();
        q.offer(root);
        boolean isLeft = true;
        while (!q.isEmpty()) {
            Deque<Integer> level = new ArrayDeque<Integer>();
            int currentLength = q.size();
            for (int i = 0; i < currentLength; i++) {
                TreeNode node = q.poll();
                if (isLeft) {
                    level.offerLast(node.val);
                } else {
                    level.offerFirst(node.val);
                }
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            res.add(new ArrayList<Integer>(level));
            isLeft = !isLeft;
        }
        return res;
    }
}
// @lc code=end

