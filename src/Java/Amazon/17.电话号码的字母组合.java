/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtracking(combinations, new StringBuffer(), phoneMap, digits, 0);
        return combinations;
    }
    public void backtracking(List<String> combinations, StringBuffer path, Map<Character, String> phoneMap, String digits, int start) {
        if (start == digits.length()) {
            combinations.add(path.toString());
            return;
        }
        for (int i = 0; i < phoneMap.get(digits.charAt(start)).length(); i++) {
            path.append(phoneMap.get(digits.charAt(start)).charAt(i));
            backtracking(combinations, path, phoneMap, digits, start + 1);
            path.deleteCharAt(start);
        }
    }
}
// @lc code=end

