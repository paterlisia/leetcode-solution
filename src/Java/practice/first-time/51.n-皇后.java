/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N 皇后
 */

// @lc code=start
class Solution {
        Set<Integer> cols = new HashSet<Integer>();
        Set<Integer> dig1 = new HashSet<Integer>();
        Set<Integer> dig2 = new HashSet<Integer>();
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        backtracking(n, res, queens, 0);
        return res;
    }
    public void backtracking(int n, List<List<String>> res, int[] queens, int row) {
        if (row == n) {
            res.add(generateQueens(n, queens));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (cols.contains(i)) continue;
            int dig1Idx = row + i;
            if (dig1.contains(dig1Idx)) continue;
            int dig2Idx = row - i;
            if (dig2.contains(dig2Idx)) continue;
            cols.add(i);
            dig1.add(dig1Idx);
            dig2.add(dig2Idx);
            queens[row] = i;
            backtracking(n, res, queens, row + 1);
            queens[row] = -1;
            cols.remove(i);
            dig1.remove(dig1Idx);
            dig2.remove(dig2Idx);
        }
    }
    public List<String> generateQueens(int n, int[] queens) {
        List<String> col = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] cur = new char[n];
            Arrays.fill(cur, '.');
            cur[queens[i]] = 'Q';
            col.add(new String(cur));
        }
        return col;
    }
}
// @lc code=end

