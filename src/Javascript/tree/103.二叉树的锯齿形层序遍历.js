/*
 * @lc app=leetcode.cn id=103 lang=javascript
 *
 * [103] 二叉树的锯齿形层序遍历
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
var zigzagLevelOrder = function(root) {
    const res = [];
    if (root === null) return res;
    const q = [];
    let isLeft = true;
    q.push(root);
    while (q.length) {
        const currentLength = q.length;
        res.push([]);
        for (let i = 0; i < currentLength; i++) {
            const node = q.shift();
            if (isLeft) {
                res[res.length - 1].push(node.val);
            } else {
                res[res.length - 1].unshift(node.val);
            }
            if (node.left) q.push(node.left);
            if (node.right) q.push(node.right);
        }
        isLeft = !isLeft;
    }
    return res;
};
// @lc code=end

