/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int lo = 0, hi = 0, sum = 0, minLength = Integer.MAX_VALUE;
        while (hi < nums.length) {
            sum += nums[hi++];
            while (sum >= target) {
                minLength = Math.min(minLength, hi - lo);
                sum -= nums[lo++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
// @lc code=end

