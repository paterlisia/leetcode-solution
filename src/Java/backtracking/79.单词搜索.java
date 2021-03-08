/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, visited, i, j, 0)) return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word, boolean[][] visited, int i, int j, int k) {
        // do not match current element, return false
        if (board[i][j] != word.charAt(k)) return false;
        // match the word, end
        else if (k == word.length() - 1) return true;
        // mark current element as visited
        visited[i][j] = true;
        // if this i, j can match word
        boolean res = false;
        // four directions to move
        int[][] direactions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int[] dir: direactions) {
            int newi = i + dir[0], newj = j + dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!visited[newi][newj]) {
                    if(dfs(board, word, visited, newi, newj, k + 1)) {
                        // match, so end loop
                        res = true;
                        break;
                    }
                }
            }
        }
        // cancel this loop visited element mark
        visited[i][j] = false;
        return res;
    }
}
// @lc code=end

