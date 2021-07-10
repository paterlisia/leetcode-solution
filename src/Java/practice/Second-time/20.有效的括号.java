/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> left = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (!left.isEmpty()) {
                    char ch = left.pop();
                    if (map.get(s.charAt(i)) != ch) return false;
                } else return false;
            } else {
                left.push(s.charAt(i));
            }
        }
        return left.isEmpty();
    }
}
// @lc code=end

