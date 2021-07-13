/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N 皇后
 */

// @lc code=start
class Solution {
    Set<Integer> cols = new HashSet<>();
    Set<Integer> dig1 = new HashSet<>();
    Set<Integer> dig2 = new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int[] queens = new int[n];
        backtracking(n, queens, 0, res);
        return res;
    }
    public void backtracking(int n, int[] queens, int start, List<List<String>> res) {
        if (start == n) {
            res.add(generateQueens(queens));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (cols.contains(i)) continue;
            int dig1Idx = start + i;
            if (dig1.contains(dig1Idx)) continue;
            int dig2Idx = start - i;
            if (dig2.contains(dig2Idx)) continue;
            cols.add(i);
            dig1.add(dig1Idx);
            dig2.add(dig2Idx);
            queens[start] = i;
            backtracking(n, queens, start + 1, res);
            queens[start] = -1;
            cols.remove(i);
            dig1.remove(dig1Idx);
            dig2.remove(dig2Idx);
        }
    }
    public List<String> generateQueens(int[] queens) {
        List<String> cols = new ArrayList<>();
        for (int i = 0; i < queens.length; i++) {
            char[] col = new char[queens.length];
            Arrays.fill(col, '.');
            col[queens[i]] = 'Q';
            cols.add(new String(col));
        }
        return cols;
    }
}
// @lc code=end

