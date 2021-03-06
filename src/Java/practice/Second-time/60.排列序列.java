/*
 * @lc app=leetcode.cn id=60 lang=java
 *
 * [60] 排列序列
 */

// @lc code=start
class Solution {
    public String getPermutation(int n, int k) {
        k--;
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; i++){
            factorial[i] = i * factorial[i - 1];
        }
        List<Integer> nums = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        StringBuffer res = new StringBuffer();
        for (int i = n - 1; i >= 0; i--) {
            int index = k / factorial[i];
            res.append(nums.remove(index));
            k -= index * factorial[i];
            n--;
        }
        return res.toString();
    }
}
// @lc code=end

