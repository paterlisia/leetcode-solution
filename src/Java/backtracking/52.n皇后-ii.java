/*
 * @lc app=leetcode.cn id=52 lang=java
 *
 * [52] N皇后 II
 */

// @lc code=start
class Solution {
    public int totalNQueens(int n) {
        Set<Integer> col = new HashSet<Integer>();
        Set<Integer> dig1 = new HashSet<Integer>();
        Set<Integer> dig2 = new HashSet<Integer>();
        return backtracking(n, 0, col, dig1, dig2);
        
    }
    public int backtracking(int n, int row, Set<Integer> col, Set<Integer> dig1, Set<Integer> dig2) {
        if (row == n) return 1;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (col.contains(i)) continue;
            int dig1Idx = row - i;
            if (dig1.contains(dig1Idx)) continue;
            int dig2Idx = row + i;
            if (dig2.contains(dig2Idx)) continue;
            col.add(i);
            dig1.add(dig1Idx);
            dig2.add(dig2Idx);
            cnt += backtracking(n, row + 1, col, dig1, dig2);
            col.remove(i);
            dig1.remove(dig1Idx);
            dig2.remove(dig2Idx);
        }
        return cnt;
    }
}
// @lc code=end

