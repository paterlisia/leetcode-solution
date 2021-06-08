/*
 * @lc app=leetcode.cn id=187 lang=java
 *
 * [187] 重复的DNA序列
 */

// @lc code=start
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> subsequences = new HashSet<String>(), res = new HashSet();
        for (int i = 0; i <s.length() - 10 + 1; i++) {
            String window = s.substring(i, i + 10);
            if (subsequences.contains(window)) res.add(window);
            subsequences.add(window);
        }
        return new ArrayList<String>(res);
    }
}
// @lc code=end

