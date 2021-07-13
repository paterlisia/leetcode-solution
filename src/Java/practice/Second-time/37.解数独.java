/*
 * @lc app=leetcode.cn id=37 lang=java
 *
 * [37] 解数独
 */

// @lc code=start
class Solution {
    boolean end = false;
    public void solveSudoku(char[][] board) {
        List<int[]> blankSpaces = new ArrayList<>();
        boolean[][] cols = new boolean[board.length][9];
        boolean[][] rows = new boolean[board.length][9];
        boolean[][][] boxes = new boolean[3][3][9];
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
        dfs(board, cols, rows, boxes, 0, blankSpaces);
    }
    public void dfs (char[][] board, boolean[][] cols, boolean[][] rows, boolean[][][] boxes, int start, List<int[]> blankSpaces) {
        if (start == blankSpaces.size()) {
            end = true;
            return;
        }
        int[] index = blankSpaces.get(start);
        int x = index[0], y = index[1];
        for (int i = 0; i < 9 && !end; i++) {
            if (!cols[x][i] && !rows[y][i] && !boxes[x / 3][y / 3][i]) {
                cols[x][i] = rows[y][i] = boxes[x / 3][y / 3][i] = true;
                board[x][y] = (char) ('0' + i + 1);
                dfs(board, cols, rows, boxes, start + 1, blankSpaces);
                cols[x][i] = rows[y][i] = boxes[x / 3][y / 3][i] = false;
            }
        }
    }
}
// @lc code=end

