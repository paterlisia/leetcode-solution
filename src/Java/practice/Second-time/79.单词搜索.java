/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
        boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited =  new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, 0)) return true;
                else visited =  new boolean[board.length][board[0].length];
        }
        }
    return false;
    }
    public boolean dfs(char[][] board, String word, int i, int j, int k) {
        if (i >= board.length || j >= board[0].length || i < 0 || j < 0) return false;
        if (board[i][j] != word.charAt(k)) return false;
        if (visited[i][j]) return false;
        visited[i][j] = true;
        if (k == word.length() - 1) {
            return word.charAt(k) == board[i][j];
        }
        return dfs(board, word, i + 1, j, k + 1)
         || dfs(board, word, i, j - 1, k + 1)
          || dfs(board, word, i - 1, j, k + 1)
           || dfs(board, word, i, j + 1, k + 1);
    }
}
// @lc code=end

