/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> need = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (need.containsKey(nums[i])) return new int[]{need.get(nums[i]), i};
            else need.put(target - nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
// @lc code=end

