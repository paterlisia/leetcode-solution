/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0, i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }
        return len;
    }
}
// @lc code=end

