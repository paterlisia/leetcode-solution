/*
 * @lc app=leetcode.cn id=137 lang=java
 *
 * [137] 只出现一次的数字 II
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int digit = 0;
            for (int j = 0; j < nums.length; j++) {
                digit += (nums[j] >> i) & 1;
            }
                if (digit % 3 == 1) res |= (1 << i);
        }
        return res;
    }
}
// @lc code=end

