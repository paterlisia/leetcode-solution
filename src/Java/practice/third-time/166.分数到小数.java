/*
 * @lc app=leetcode.cn id=166 lang=java
 *
 * [166] 分数到小数
 */

// @lc code=start
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        StringBuilder res = new StringBuilder();
        if (numerator < 0 ^ denominator < 0) res.append("-");
        HashMap<Long, Integer> position = new HashMap<>();
        Long dividened =  Math.abs((long)numerator);
        Long divisor =  Math.abs((long)denominator);
        Long quotient = dividened / divisor;
        Long remain = dividened % divisor;
        res.append(quotient);
        if (remain == 0) return res.toString();
        else res.append(".");
        while (remain > 0) {
            if (position.containsKey(remain)) {
                res.insert(position.get(remain), "(");
                res.append(")");
                break;
            } else position.put(remain, res.length());
            remain *= 10;
            res.append(remain / divisor);
            remain %= divisor;
        }
        return res.toString();
    }
}
// @lc code=end

