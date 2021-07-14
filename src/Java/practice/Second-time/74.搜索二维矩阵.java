/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0, hi = matrix.length * matrix[0].length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int y = mid % matrix[0].length, x = mid / matrix[0].length;
            if (target == matrix[x][y]) return true;
            else if (target < matrix[x][y]) hi = mid - 1;
            else lo = mid + 1;
        }
        return false;
    }
}
// @lc code=end

