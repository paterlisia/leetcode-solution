/*
 * @lc app=leetcode.cn id=52 lang=java
 *
 * [52] N皇后 II
 */

// @lc code=start
class Solution {
    Set<Integer> cols = new HashSet<>();
    Set<Integer> dig1 = new HashSet<>();
    Set<Integer> dig2 = new HashSet<>();
    public int totalNQueens(int n) {
        return backtracking(n, 0);
    }
    public int backtracking(int n, int start) {
        if (start == n) {
            return 1;
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cols.contains(i)) continue;
            int dig1Idx = start + i;
            if (dig1.contains(dig1Idx)) continue;
            int dig2Idx = start - i;
            if (dig2.contains(dig2Idx)) continue;
            cols.add(i);
            dig1.add(dig1Idx);
            dig2.add(dig2Idx);
            cnt += backtracking(n, start + 1);
            cols.remove(i);
            dig1.remove(dig1Idx);
            dig2.remove(dig2Idx);
        }
        return cnt;
    }
}
// @lc code=end

