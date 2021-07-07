/*
 * @lc app=leetcode.cn id=37 lang=java
 *
 * [37] 解数独
 */

// @lc code=start
class Solution {
    List<int[]> blankSpaces = new ArrayList<int[]>();
    boolean[][] cols = new boolean[9][9];
    boolean[][] rows = new boolean[9][9];
    boolean[][][] boxes = new boolean[3][3][9];
    boolean end = false;
    public void solveSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    blankSpaces.add(new int[]{i, j});
                } else {
                    int value = board[i][j] - '0';
                    cols[i][value - 1] = true;
                    rows[j][value - 1] = true;
                    boxes[i / 3][j / 3][value - 1] = true;
                }
            }
        }
        dfs(board, 0);
    }
    public void dfs (char[][] board, int start) {
        if (start == blankSpaces.size()) {
            end = true;
            return;
        }
        int[] index = blankSpaces.get(start);
        int i = index[0], j = index[1];
        for (int t = 0; t < 9 && !end; t++) {
            if (!cols[i][t] && !rows[j][t] &&!boxes[i / 3][j / 3][t]) {
                cols[i][t] = rows[j][t] = boxes[i / 3][j / 3][t] = true;
                board[i][j] = (char) ('0' + t + 1);
                dfs(board, start + 1);
                cols[i][t] = rows[j][t] = boxes[i / 3][j / 3][t] = false;
            }
        }
    }
}
// @lc code=end

