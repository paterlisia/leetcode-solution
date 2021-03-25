/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0, start = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) start = Math.max(start, map.get(s.charAt(i)) + 1);
            map.put(s.charAt(i), i);
            maxLen = Math.max(i - start + 1, maxLen);
        }
        return maxLen;
    }
}
// @lc code=end

