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
        int diff = 1;
        while (diff & xor != 0) diff <<= 1;
        int a = 0, b = 0;
        for (int num : nums) {
            if ((diff ^ num == 1)) a ^= num;
            else b ^= num;
        }
        return new int[]{a, b};
    }
}
// @lc code=end

