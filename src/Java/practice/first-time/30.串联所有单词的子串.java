/*
 * @lc app=leetcode.cn id=30 lang=java
 *
 * [30] 串联所有单词的子串
 */

// @lc code=start
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int wordLen = words[0].length();
        HashMap<String, Integer> allWords = new HashMap<>();
        for (String word : words) {
            int cnt = allWords.getOrDefault(word, 0);
            allWords.put(word, cnt + 1);
        }
        for (int i = 0; i < s.length() - words.length * wordLen + 1; i++) {
            HashMap<String, Integer> hasWords = new HashMap<>();
            int num = 0;
            while (num < words.length) {
                String currentWord = s.substring(i + num * wordLen, i + (num + 1) * wordLen);
                if (allWords.containsKey(currentWord)) {
                    int wordCnt = hasWords.getOrDefault(currentWord, 0);
                    hasWords.put(currentWord, wordCnt + 1);
                    if (hasWords.get(currentWord) > allWords.get(currentWord)) break;
                } else break;
            num++;
            }
            if (num == words.length) res.add(i);
        }
        return res;
    }
}
// @lc code=end

