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
        dfs(digits, 0, new StringBuilder(), res);
        return res;
    }
    public void dfs(String digits, int start, StringBuilder path, List<String> res) {
        if (digits.length() == start) {
            res.add(path.toString());
            return;
        }
        String current = map.get(digits.charAt(start));
        for (int i = 0; i < current.length(); i++) {
            path.append(current.charAt(i));
            dfs(digits, start + 1, path, res);
            path.deleteCharAt(start);
        }
    }
}
// @lc code=end

