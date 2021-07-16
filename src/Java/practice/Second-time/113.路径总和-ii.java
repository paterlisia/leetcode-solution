/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        backtracking(root, targetSum, res, new ArrayDeque<Integer>());
        return res;
    }
    public void backtracking(TreeNode root, int targetSum, List<List<Integer>> res, Deque<Integer> path) {
        if (root == null) return;
        path.offerLast(root.val);
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0) res.add(new ArrayList<Integer>(path));
        backtracking(root.left, targetSum, res, path);
        backtracking(root.right, targetSum, res, path);
        path.removeLast();
    }
}
// @lc code=end

