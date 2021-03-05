/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix.length * matrix[0].length - 1;
        // binary search
        while (left <= right) {
            int mid = (left + right) / 2;
            // loacte element in matrix
            int midVal = matrix[mid / matrix[0].length][mid % matrix[0].length];
            if (midVal == target) return true;
            else if (midVal > target) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}
// @lc code=end

