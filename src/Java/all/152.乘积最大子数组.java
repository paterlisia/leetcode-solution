/*
 * @lc app=leetcode.cn id=152 lang=java
 *
 * [152] 乘积最大子数组
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int maxP = nums[0], minP = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int preMax = maxP;
            maxP = Math.max(maxP * nums[i], Math.max(minP * nums[i], nums[i]));
            minP = Math.min(preMax * nums[i], Math.min(minP * nums[i], nums[i]));
            ans = Math.max(ans, maxP);
        }
        return ans;
    }
}
// @lc code=end

