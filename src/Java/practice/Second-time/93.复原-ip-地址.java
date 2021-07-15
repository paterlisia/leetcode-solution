/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原 IP 地址
 */

// @lc code=start
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtracking(res, s, new ArrayDeque<String>(), 0, s.length(), 0);
        return res;
    }
    public void backtracking(List<String> res, String s, Deque<String> path, int start, int len, int number) {
        if (len == start) {
            if (number == 4) res.add(String.join(".", path));
            return;
        }
        if ((len - start) < 4 - number || (len - start) > (4 - number) * 3) return;
        for (int i = 0; i < 3; i++) {
            if (start + i >= len) break;
            int substring = isValid(s, start, start + i);
            if (substring != -1) {
                path.offerLast(substring + "");
                backtracking(res, s, path, start + i + 1, len, number + 1);
                path.removeLast();

            }
        }
    }
    public int isValid(String s, int start, int end) {
        int len = end - start + 1;
        if (len > 1 && s.charAt(start) == '0') return -1;
        // transfer to int
        int res = 0;
        // ! do not forget end
        for (int i = start; i <= end; i++) res = s.charAt(i) - '0' + res * 10;
        if (res > 255) return -1;
        return res;
    }
}
// @lc code=end

