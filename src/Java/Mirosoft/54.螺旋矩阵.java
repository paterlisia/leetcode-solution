/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        int count = matrix.length * matrix[0].length, n = 1;
        while (n <= count) {
            for (int i = left; i <= right && n <= count; i++) {
                res.add(matrix[top][i]);
                n++;
            }
            top++;
            for (int i = top; i <= bottom && n <= count; i++) {
                res.add(matrix[i][right]);
                n++;
            }
            right--;
            for (int i = right; i >= left && n <= count; i--) {
                res.add(matrix[bottom][i]);
                n++;
            }
            bottom--;
            for (int i = bottom; i >= top && n <= count; i--) {
                res.add(matrix[i][left]);
                n++;
            }
            left++;
        }
        return res;
    }
}
// @lc code=end

