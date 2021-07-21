/*
 * @lc app=leetcode.cn id=152 lang=java
 *
 * [152] 乘积最大子数组
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int maxPro = nums[0], minPro = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int preMax = maxPro;
            maxPro = Math.max(maxPro * nums[i], Math.max(minPro * nums[i], nums[i]));
            minPro = Math.min(minPro * nums[i], Math.min(preMax * nums[i], nums[i]));
            res = Math.max(maxPro, res);
        }
        return res;
    }
}
// @lc code=end

