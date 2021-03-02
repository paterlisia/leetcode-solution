/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int t = 0, b = matrix.length - 1, l =0, r = matrix[0].length - 1;
        int count = matrix.length * matrix[0].length, num = 1;
        List<Integer> res = new ArrayList<>();
        while (num <= count) {
            for (int i = l; i <= r && num <= count; i++) {
                res.add(matrix[t][i]);
                num++;
            }
            t++;
            for (int i = t; i <= b && num <= count; i++) {
                res.add(matrix[i][r]);
                num++;
            }
            r--;
            for (int i = r; i >= l && num <= count; i--) {
                res.add(matrix[b][i]);
                num++;
            }
            b--;
            for (int i = b; i >= t && num <= count; i--) {
                res.add(matrix[i][l]);
                num++;
            }
            l++;

        }
        return res;

    }
}
// @lc code=end

