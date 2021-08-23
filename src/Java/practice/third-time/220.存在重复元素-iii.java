/*
 * @lc app=leetcode.cn id=220 lang=java
 *
 * [220] 存在重复元素 III
 */

// @lc code=start
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<Long>();
        for (int i = 0; i < nums.length; i++) {
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= (long)nums[i] + (long)t) return true;
            set.add((long) nums[i]);
            if (i >= k) set.remove((long) nums[i - k]);
        }
        return false;
    }
}
// @lc code=end

