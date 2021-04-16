/*
 * @lc app=leetcode.cn id=37 lang=java
 *
 * [37] 解数独
 */

// @lc code=start
class Solution {
        List<int[]> spaces = new ArrayList<int[]>();
        boolean[][] line = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][][] block = new boolean[3][3][9];
        boolean end = false;
    public void solveSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    spaces.add(new int[]{i, j});
                } else {
                    int number = board[i][j] - '0' - 1;
                    line[i][number] = col[j][number] = block[i / 3][j / 3][number] = true;
                }
            }
        }
        dfs(board, 0);
    }
    public void dfs(char[][] board, int start) {
        if (start == spaces.size()) {
            end = true;
            return;
        }
        int[] index = spaces.get(start);
        int i = index[0], j = index[1];
        for (int t = 0; t < 9 && !end; t++) {
            if (!line[i][t] && !col[j][t] && !block[i / 3][j / 3][t]) {
                line[i][t] = col[j][t] = block[i / 3][j / 3][t] = true;
                board[i][j] = (char) (t + '0' + 1);
                dfs(board, start + 1);
                line[i][t] = col[j][t] = block[i / 3][j / 3][t] = false;
            }
        }
    }
}
// @lc code=end

