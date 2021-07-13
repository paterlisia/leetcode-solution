/*
 * @lc app=leetcode.cn id=30 lang=java
 *
 * [30] 串联所有单词的子串
 */

// @lc code=start
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        HashMap<String, Integer> wordCnt = new HashMap<>();
        for (String w : words) {
            wordCnt.put(w, wordCnt.getOrDefault(w, 0) + 1);
        }
        int wordLen = words[0].length();
        for (int i = 0; i < s.length() - wordLen * words.length + 1; i++) {
            int j = 0;
            HashMap<String, Integer> hasWords = new HashMap<>();
            for (; j < words.length; j++) {
                String curWord = s.substring(i + j * wordLen, i + wordLen * (j + 1));
                if (wordCnt.containsKey(curWord)) {
                    hasWords.put(curWord, hasWords.getOrDefault(curWord, 0) + 1);
                    if (hasWords.get(curWord) > wordCnt.get(curWord)) break;
                } else break;
            }
            if (j == words.length) res.add(i);
        }
        return res;
    }
}
// @lc code=end

