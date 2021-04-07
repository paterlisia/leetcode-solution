/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') res++;
                backtracking(grid, i, j);
            }
        }
        return res;
    }
    public void backtracking(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return;
        if (grid[i][j] != '1') return;
        grid[i][j] = '2';
        backtracking(grid, i + 1, j);
        backtracking(grid, i - 1, j);
        backtracking(grid, i, j + 1);
        backtracking(grid, i, j - 1);
    }
}
// @lc code=end

