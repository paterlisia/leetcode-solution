/*
 * @lc app=leetcode.cn id=228 lang=java
 *
 * [228] 汇总区间
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        int i = 0, n = nums.length;
        while (i < n) {
            int low = i;
            i++;
            while (i < n && nums[i] == nums[i - 1] + 1) i++;
            int high = i - 1;
            StringBuffer tmp = new StringBuffer(Integer.toString(nums[low]));
            if (low < high) {
                tmp.append("->");
                tmp.append(Integer.toString(nums[high]));
            }
            res.add(tmp.toString());
        }
        return res;
    }
}
// @lc code=end

