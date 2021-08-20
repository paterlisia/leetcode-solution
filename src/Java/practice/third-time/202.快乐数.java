/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public int getNext (int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            sum += digit * digit;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> map = new HashSet<Integer>();
        while (n != 1 && !map.contains(n)) {
            map.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
}
// @lc code=end

