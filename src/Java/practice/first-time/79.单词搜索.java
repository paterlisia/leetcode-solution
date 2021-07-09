/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    private static final int[][] DIRECTIONS = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    private boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int l = board.length, w = board[0].length;
        visited = new boolean[l][w];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < w; j++) {
                if (dfs(board, word, i, j, l, w, 0)) return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word, int i, int j, int l, int w, int k) {
        if (k == word.length() - 1) {
            return board[i][j] == word.charAt(k);
        }
        if (board[i][j] == word.charAt(k)) {
            visited[i][j] = true;
            for (int[] direction : DIRECTIONS) {
                int newX = i + direction[0];
                int newY = j + direction[1];
                if (judge(newX, newY, l, w) && !visited[newX][newY]) {
                    if (dfs(board, word, newX, newY, l, w, k + 1)) {
                        return true;
                    }
                }
            }
            visited[i][j] = false;
        }
        return false;

    }
    public boolean judge(int i, int j, int l, int w) {
        return i >= 0 && i < l && j >= 0 && j < w;
    }
}
// @lc code=end

