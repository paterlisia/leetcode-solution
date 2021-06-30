/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (cnt == 0) candidate = num;
            cnt += candidate == num? 1 : -1;
        }
        return candidate;
    }
}
// @lc code=end

