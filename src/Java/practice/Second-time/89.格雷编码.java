/*
 * @lc app=leetcode.cn id=89 lang=java
 *
 * [89] 格雷编码
 */

// @lc code=start
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        int head = 1;
        res.add(0);
        while (n > 0) {
            for (int i = res.size() - 1; i >= 0; i--) {
                res.add(res.get(i) + head);
            }
            head <<= 1;
            n--;
        }
        return res;
    }
}
// @lc code=end

