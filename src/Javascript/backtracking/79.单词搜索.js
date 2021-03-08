/*
 * @lc app=leetcode.cn id=79 lang=javascript
 *
 * [79] 单词搜索
 */

// @lc code=start
/**
 * @param {character[][]} board
 * @param {string} word
 * @return {boolean}
 */
var exist = function(board, word) {
    const visited = new Array(board.length);
    for (let i = 0; i < board.length; i++) {
        visited[i] = new Array(board[0].length).fill(false);
    }
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[0].length; j++) {
            if (dfs(board, word, visited, i, j, 0)) return true;
        }
    }
    return false;
};
const dfs = (board, word, visited, i, j, k) => { 
    // ! locate element in char array
    if (board[i][j] !== word.charAt(k)) return false;
    else if (k === word.length - 1) return true;
    visited[i][j] = true;
    const directions = [[0, 1], [0, -1], [1, 0], [-1, 0]];
    let res = false;
    for (const [dx, dy] of directions) {
        const newi = i + dx, newj = j + dy;
        if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
            if (!visited[newi][newj]) {
                if (dfs(board, word, visited, newi, newj, k + 1)) {
                    res = true;
                    break;
                }
            }
        }
    }
    visited[i][j] = false;
    return res;
}
// @lc code=end

