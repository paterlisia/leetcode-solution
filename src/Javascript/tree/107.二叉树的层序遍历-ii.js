/*
 * @lc app=leetcode.cn id=107 lang=javascript
 *
 * [107] 二叉树的层序遍历 II
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
var levelOrderBottom = function(root) {
    const res = [];
    if (root === null) return res;
    const q = [];
    q.push(root);
    while (q.length !== 0) {
        const currentLength = q.length;
        const level = [];
        for (let i = 0; i < currentLength; i++) {
            // ! always make a mistake here: pull the first element
            const node = q.shift();
            level.push(node.val);
            if (node.left) q.push(node.left);
            if (node.right) q.push(node.right);
        }
        res.unshift(level);
    }
    return res;
};
// @lc code=end

