/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N 皇后
 */

// @lc code=start
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        Set<Integer> cols = new HashSet<Integer>();
        Set<Integer> dig1 = new HashSet<Integer>();
        Set<Integer> dig2 = new HashSet<Integer>();
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        backtracking(n, 0, res, queens, cols, dig1, dig2);
        return res;
    }
    public void backtracking(int n, int row, List<List<String>> res, int[] queens, Set<Integer> cols, Set<Integer> dig1, Set<Integer> dig2) {
        if (row == n) {
            List<String> queen = generateQueens(n, queens);
            res.add(queen);
        }
        for (int i = 0; i < n; i++) {
            if (cols.contains(i)) continue;
            int dig1Idx = row - i;
            if (dig1.contains(dig1Idx)) continue;
            int dig2Idx = row + i;
            if (dig2.contains(dig2Idx)) continue;
            queens[row] = i;
            cols.add(i);
            dig1.add(dig1Idx);
            dig2.add(dig2Idx);
            backtracking(n, row + 1, res, queens, cols, dig1, dig2);
            queens[row] = -1;
            cols.remove(i);
            dig1.remove(dig1Idx);
            dig2.remove(dig2Idx);
        }
    }
    public List<String> generateQueens(int n, int[] queens) {
        List<String> queen = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] cur = new char[n];
            Arrays.fill(cur, '.');
            cur[queens[i]] = 'Q';
            queen.add(new String(cur));
        }
        return queen;
    }
}
// @lc code=end

