/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            // number list in current row
            List<Integer> level = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                // boarder condition
                if (j == 0 || j == i) level.add(1);
                // transfer equation (j = 0 when i = 0 so we can ignore i = 0)
                else level.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(level);
        }
        return res;
    }
}
// @lc code=end

