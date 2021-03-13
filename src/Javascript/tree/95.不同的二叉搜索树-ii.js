/*
 * @lc app=leetcode.cn id=95 lang=javascript
 *
 * [95] 不同的二叉搜索树 II
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
 * @param {number} n
 * @return {TreeNode[]}
 */
var generateTrees = function(n) {
    const res = [];
    if (n === 0) return res;
    return getBinarySearchTrees(1, n);
};
const getBinarySearchTrees = (start, end) => {
    let res = [];
    if (start > end) {
        res.push(null);
        return res;
    }
    if (start === end) {
        res.push(new TreeNode(start));
        return res;
    }
    for (let i = start; i <= end; i++) {
        const leftTrees = getBinarySearchTrees(start, i - 1);
        const rightTrees = getBinarySearchTrees(i + 1, end);
        for (const leftTree of leftTrees) {
            for (const rightTree of rightTrees) {
                const root = new TreeNode(i);
                root.left = leftTree;
                root.right = rightTree;
                res.push(root);
            }
        }
    }
    return res;
}
// @lc code=end

