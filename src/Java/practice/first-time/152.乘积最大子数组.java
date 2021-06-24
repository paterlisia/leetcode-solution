/*
 * @lc app=leetcode.cn id=152 lang=java
 *
 * [152] 乘积最大子数组
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int res = nums[0];
        int maxP = nums[0], minP = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int preMax = maxP;
            maxP = Math.max(maxP * nums[i], Math.max(nums[i], minP * nums[i])); 
            minP = Math.min(preMax * nums[i],  Math.min(nums[i], minP * nums[i])); 
            res = Math.max(res, maxP);
        }
        return res;
    }
}
// @lc code=end

