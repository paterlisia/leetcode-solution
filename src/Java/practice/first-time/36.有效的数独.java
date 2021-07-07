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
        for (int i = 0; i < board.length; i++) {
            cols[i]= new HashMap<Integer, Integer>();
            rows[i]= new HashMap<Integer, Integer>();
            boxes[i]= new HashMap<Integer, Integer>();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int n = board[i][j] - '0';
                int boxIdx = 3 * (i / 3) + j / 3;
                if (board[i][j] != '.'){
                    cols[i].put(n, cols[i].getOrDefault(n, 0) + 1);
                rows[j].put(n, rows[j].getOrDefault(n, 0) + 1);
                boxes[boxIdx].put(n, boxes[boxIdx].getOrDefault(n, 0) + 1);
                if (cols[i].get(n) > 1 || rows[j].get(n) > 1 || boxes[boxIdx].get(n) > 1) return false;
                }
                
            }
        }
        return true;
    }
}
// @lc code=end

