/*
 * @lc app=leetcode.cn id=260 lang=java
 *
 * [260] 只出现一次的数字 III
 */

// @lc code=start
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) xor ^= num;
        xor &= -xor;
        int a = 0, b = 0;
        for (int num : nums) {
            if ((xor & num) == 0) a ^= num;
            else b ^= num;
        }
        return new int[]{a, b};
    }
}
// @lc code=end

