/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) rows.add(new StringBuilder());
        int flag = -1, i = 0, row = 0;
        while (i < s.length()) {
            if (row == 0 || row == numRows - 1) flag = -flag;
            rows.get(row).append(s.charAt(i++));
            row += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder element : rows) {
            res.append(element);
        }
        return res.toString();
    }
}
// @lc code=end

