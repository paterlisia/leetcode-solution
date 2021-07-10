/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> position = new HashMap<>();
        int maxLen = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (position.containsKey(s.charAt(i))) {
                start = Math.max(position.get(s.charAt(i)) + 1, start);
            }
            maxLen = Math.max(i - start + 1, maxLen);
            position.put(s.charAt(i), i);
        }
        return maxLen;
    }
}
// @lc code=end

