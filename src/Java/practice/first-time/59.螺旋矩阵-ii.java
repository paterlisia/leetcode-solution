/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int count = n * n, top = 0, bottom = n - 1, left = 0, right = n - 1, num = 1;
        while (count >= num) {
            for (int i = left; i <= right && count >= num; i++) res[top][i] = num++;
            top++;
            for (int i = top; i <= bottom && count >= num; i++) res[i][right] = num++;
            right--;
            for (int i = right; i >= left && count >= num; i++) res[bottom][i] = num++;
            bottom--;
            for (int i = bottom; i >= top && count >= num; i++) res[i][left] = num++;
            left++;
        }
        return res;
    }
}
// @lc code=end

