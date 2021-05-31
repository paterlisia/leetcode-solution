/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0) {
            int remain = columnNumber % 26 == 0 ? 26 : columnNumber % 26;
            res.insert(0, (char) ('A' + remain - 1));
            columnNumber = (columnNumber  - remain) / 26;
        }
        return res.toString();
    }
}
// @lc code=end

