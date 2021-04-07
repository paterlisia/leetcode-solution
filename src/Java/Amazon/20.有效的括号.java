/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Deque<Character> q = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (q.isEmpty() || q.pop() != map.get(s.charAt(i))) return false;
            }
            else q.push(s.charAt(i));
        }
            return q.isEmpty();
    }
}
// @lc code=end

