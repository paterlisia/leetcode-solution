/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int count = (matrix.length ) * (matrix[0].length ), num = 1;
        while (count >= num) {
            for (int i = left; i <= right && count >= num; i++) {
                res.add(matrix[top][i]);
                num++;
            }
            top++;
            for (int i = top; i <= bottom && count >= num; i++) {
                res.add(matrix[i][right]);
                num++;
            }
            right--;
            for (int i = right; i >= left && count >= num; i--) {
                res.add(matrix[bottom][i]);
                num++;
            }
            bottom--;
            for (int i = bottom; i >= top && count >= num; i--) {
                res.add(matrix[i][left]);
                num++;
            }
            left++;
        }
        return res;
    }
}
// @lc code=end

