/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                    if (backtracking(board, word, new boolean[board.length][board[0].length], i, j, 0))
                        return true;
            }
        }
        return false;
    }
    public boolean backtracking(char[][] board, String word, boolean[][] used, int i, int j, int start) {
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        if (board[i][j] != word.charAt(start)) return false;
        if (start == word.length() - 1) return true;
        used[i][j] = true;
        for (int t = 0; t < 4; t++) {
            int newi = i + directions[t][0];
            int newj = j + directions[t][1];
            if (boarderJudge(board, newi, newj) && !used[newi][newj])
                if (backtracking(board, word, used, newi, newj, start + 1)) return true;
        }
        used[i][j] = false;
        return false;
    }
    public boolean boarderJudge(char[][] board, int i, int j) {
        return (i >= 0 && j >= 0 && i < board.length && j < board[0].length);
    }
}
// @lc code=end

