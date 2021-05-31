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
        // negative or not
        if (numerator < 0 ^ denominator < 0) res.append("-");
        long dividened = Math.abs((long) numerator);
        long divisor = Math.abs((long) denominator);
        long quotient = dividened / divisor;
        long remain = dividened % divisor;
        res.append(quotient);
        if (remain == 0) return res.toString();
        else res.append(".");
        // float part
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        while (remain > 0) {
            if (map.containsKey(remain)) {
                res.insert(map.get(remain), "(");
                res.append(")");
                break;
            } else {
                map.put(remain, res.length());

            }
            remain *= 10;
            res.append(remain / divisor);
            remain %= divisor;
        }
        return res.toString();
    }
}
// @lc code=end

