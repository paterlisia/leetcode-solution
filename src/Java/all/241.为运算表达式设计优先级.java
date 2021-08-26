/*
 * @lc app=leetcode.cn id=241 lang=java
 *
 * [241] 为运算表达式设计优先级
 */

// @lc code=start
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' ||
             expression.charAt(i) == '-' ||
            expression.charAt(i) == '*') {
                String partition1 = expression.substring(0, i);
                String partition2 = expression.substring(i + 1);
                List<Integer> partRet1 = diffWaysToCompute(partition1);
                List<Integer> partRet2 = diffWaysToCompute(partition2);
                for (int p1: partRet1) {
                    for (int p2: partRet2) {
                        int r = 0;
                        switch (expression.charAt(i)) {
                            case '+':
                                r = p1 + p2;
                                break;
                            case '-':
                                r = p1 - p2;
                                break;
                            case '*':
                                r = p1 * p2;
                                break;
                            default:
                                break;
                        }
                        res.add(r);
                    }
                }
            }
        }
        if (res.size() == 0) res.add(Integer.valueOf(expression));
            return res;
    }
}
// @lc code=end

