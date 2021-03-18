/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int left = 0, right = row * col - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid / col][mid % col] == target) return true;
            if (matrix[mid / col][mid % col] > target) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}
// @lc code=end

