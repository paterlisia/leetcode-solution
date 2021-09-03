/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<Integer>();
        for (int num : nums) {
            if (map.contains(num)) return true;
            map.add(num);
        }
        return false;
    }
}
// @lc code=end

