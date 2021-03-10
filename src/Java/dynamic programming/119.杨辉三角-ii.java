/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> level = new ArrayList<>();
        level.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                level.set(j, level.get(j) + level.get(j - 1));
            }
            level.add(1);
        }
        return level;
    }
}
// @lc code=end

