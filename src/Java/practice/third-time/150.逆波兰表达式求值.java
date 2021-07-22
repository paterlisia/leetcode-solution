/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (String element : tokens) {
            if (!element.equals("+") && !element.equals("-") &&!element.equals("*") &&!element.equals("/"))
                s.push(Integer.parseInt(element));
            else {
                int val2 = s.pop();
                int val1 = s.pop();
                switch (element) {
                    case "+":
                        s.push(val1 + val2);
                        break;
                    case "-":
                        s.push(val1 - val2);
                        break;
                
                    case "*":
                        s.push(val1 * val2);
                        break;
                
                    case "/":
                        s.push(val1 / val2);
                        break;
                    default:
                        break;
                }
            }
        }
        return s.pop();
    }
}
// @lc code=end

