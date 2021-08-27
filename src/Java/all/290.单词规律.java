/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> mapping = new HashMap<>();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (mapping.containsKey(pattern.charAt(i))) {
                if (!mapping.get(pattern.charAt(i)).equals(words[i])) return false;
            } else {
                if (mapping.containsValue(words[i])) return false;
                mapping.put(pattern.charAt(i), words[i]);
            }
        }
        return true;
    }
}
// @lc code=end

