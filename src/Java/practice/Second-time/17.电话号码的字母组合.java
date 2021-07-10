/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    Map<Character, String> map = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;
        backtracking(digits, 0, new StringBuilder(), res);
        return res;
    }
    public void backtracking (String digits, int start, StringBuilder path, List<String> res) {
        if (start == digits.length()) {
            res.add(path.toString());
            return;
        }
        String choice = map.get(digits.charAt(start));
        for (int i = 0; i < choice.length(); i++) {
            path.append(choice.charAt(i));
            backtracking(digits, start + 1, path, res);
            path.deleteCharAt(path.length() -1);
        }
    }
}
// @lc code=end

