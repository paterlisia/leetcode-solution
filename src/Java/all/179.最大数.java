/*
 * @lc app=leetcode.cn id=179 lang=java
 *
 * [179] 最大数
 */

// @lc code=start
class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        // convert int to string in array
        for (int i = 0; i < nums.length; i++) s[i] = "" + nums[i];
        Arrays.sort(s, (a, b) -> {
            String sa = a + b, sb = b + a;
            return sb.compareTo(sa);
        });
        StringBuilder res = new StringBuilder();
        for (String ss: s) res.append(ss);
        int k = 0;
        while (k < nums.length - 1 && res.charAt(k) == '0') k++; // case '00'
        return res.substring(k);
    }
}
// @lc code=end

