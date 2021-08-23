/*
 * @lc app=leetcode.cn id=227 lang=java
 *
 * [227] 基本计算器 II
 */

// @lc code=start
class Solution {
    public int calculate(String s) {
        Stack<Integer> signals = new Stack<>();
        char preSign = '+';
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }  
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == s.length() - 1) {
                switch (preSign) {
                    case '+':
                        signals.push(num);
                        break;
                    case '-':
                        signals.push(-num);
                        break;
                    case '*':
                    signals.push(signals.pop() * num);
                        break;
                    default:
                    signals.push(signals.pop() / num);
                        break;
                }
                preSign = s.charAt(i);
                num = 0;
            }
        }
        int res = 0;
        while (!signals.isEmpty()) {
            res += signals.pop();
        }
        return res;
    }
}
// @lc code=end

