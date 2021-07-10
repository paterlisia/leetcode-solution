/*
 * @lc app=leetcode.cn id=12 lang=java
 *
 * [12] 整数转罗马数字
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};    
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res = new StringBuilder();
        int index = 0;
        while (num > 0) {
            if (num >= values[index]) {
                res.append(symbols[index]);
                num -= values[index];
            } else index++;
        }
        return res.toString();
    }
}
// @lc code=end

