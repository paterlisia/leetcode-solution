/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dropDuplicates = new HashSet<Integer>();
        for (int num : nums) {
            if (dropDuplicates.contains(num)) return true;
            dropDuplicates.add(num);
        }
        return false;
    }
}
// @lc code=end

