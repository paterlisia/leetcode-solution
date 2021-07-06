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
        char[] charArray = s.toCharArray();
        int currentRow = 0, flag = -1;
        for (char c : charArray) {
            rows.get(currentRow).append(c);
            if (currentRow == 0 || currentRow == numRows - 1) flag = -flag;
            currentRow += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder item : rows) {
            res.append(item);
        }
        return res.toString();
    }
}
// @lc code=end

