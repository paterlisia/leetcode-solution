/*
 * @lc app=leetcode.cn id=52 lang=java
 *
 * [52] N皇后 II
 */

// @lc code=start
class Solution {
    public int totalNQueens(int n) {
        Set<Integer> cols = new HashSet<>();
        Set<Integer> dig1 = new HashSet<>();
        Set<Integer> dig2 = new HashSet<>();
        return backtracking(n, 0, cols, dig1, dig2);
    }
    public int backtracking(int n, int row, Set<Integer> cols, Set<Integer> dig1, Set<Integer> dig2) {
        if (n == row) {
            return 1;
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cols.contains(i)) continue;
            int dig1Idx = row - i;
            if (dig1.contains(dig1Idx)) continue;
            int dig2Idx = row + i;
            if (dig2.contains(dig2Idx)) continue;
            cols.add(i);
            dig1.add(dig1Idx);
            dig2.add(dig2Idx);
            cnt += backtracking(n, row + 1, cols, dig1, dig2);
            cols.remove(i);
            dig1.remove(dig1Idx);
            dig2.remove(dig2Idx);
        }
        return cnt;
    }
}
// @lc code=end

