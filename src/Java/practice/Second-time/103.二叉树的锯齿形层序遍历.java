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
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> q = new ArrayDeque<TreeNode>();
        q.offer(root);
        boolean flag = true;
        while (!q.isEmpty()) {
            int currentLength = q.size();
            Deque<Integer> level = new ArrayDeque<Integer>();
            for (int i = 0; i < currentLength; i++) {
                TreeNode node = q.poll();
                if (flag) level.offer(node.val);
                else level.offerFirst(node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            flag = !flag;
            res.add(new ArrayList<Integer>(level));
        }
        return res;
    }
}
// @lc code=end

