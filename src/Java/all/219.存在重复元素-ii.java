/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> kLengthSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (kLengthSet.contains(nums[i])) return true;
            kLengthSet.add(nums[i]);
            if (kLengthSet.size() > k) kLengthSet.remove(nums[i - k]);
        }
        return false;
    }
}
// @lc code=end

