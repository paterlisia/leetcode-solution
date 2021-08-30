/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> squreSum = new HashSet<>();
        while (squreSum.add(n)) {
            int newSqureSum = 0;
            while (n > 0) {
                int digit = n % 10;
                newSqureSum += digit * digit;
                n /= 10;
            }
            n = newSqureSum;
            if (n == 1) return true;
        }
        return false;
    }
}
// @lc code=end

