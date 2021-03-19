/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int left = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            // ! max left
            if (map.containsKey(s.charAt(i))) left = Math.max(left, map.get(s.charAt(i)) + 1);
            map.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}
// @lc code=end

