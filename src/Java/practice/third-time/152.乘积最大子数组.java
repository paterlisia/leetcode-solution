/*
 * @lc app=leetcode.cn id=152 lang=java
 *
 * [152] 乘积最大子数组
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0], maxPro = nums[0], minPro = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tmpMax = maxPro;
            maxPro = Math.max(nums[i], Math.max(maxPro * nums[i], minPro * nums[i]));
            minPro = Math.min(nums[i], Math.min(tmpMax * nums[i], minPro * nums[i]));
            res = Math.max(res, maxPro);
        }
        return res;
    }
}
// @lc code=end

