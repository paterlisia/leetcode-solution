/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sign = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (!s.equals("+") && !s.equals("-") &&!s.equals("*") &&!s.equals("/")) sign.push(Integer.parseInt(s));
            else {
                int num2 = sign.pop();
                int num1 = sign.pop();
                switch(s) {
                    case "+":
                        sign.push(num1 + num2);
                        break;
                    case "-":
                        sign.push(num1 - num2);
                        break;
                    case "*":
                        sign.push(num1 * num2);
                        break;
                    case "/":
                        sign.push(num1 / num2);
                        break;
                    default:
                }
            }
        }
        return sign.pop();
    }
}
// @lc code=end

