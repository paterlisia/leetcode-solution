/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Integer>[] cols = new HashMap[9];
        HashMap<Integer, Integer>[] rows = new HashMap[9];
        HashMap<Integer, Integer>[] boxes = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            cols[i] = new HashMap<Integer, Integer>();
            rows[i] = new HashMap<Integer, Integer>();
            boxes[i] = new HashMap<Integer, Integer>();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int value = board[i][j] - '0';
                if (board[i][j] != '.') {
                    cols[i].put(value, cols[i].getOrDefault(value, 0) + 1);
                    rows[j].put(value, rows[j].getOrDefault(value, 0) + 1);
                    boxes[j / 3 + (i / 3) * 3].put(value, boxes[j / 3 + (i / 3) * 3].getOrDefault(value, 0) + 1);
                
                if (cols[i].get(value) > 1 || rows[j].get(value) > 1 || boxes[j / 3 + (i / 3) * 3].get(value) > 1) return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

