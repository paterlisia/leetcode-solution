/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原 IP 地址
 */

// @lc code=start
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        backtracking(s, 0, 0, res, new ArrayDeque<String>());
        return res;
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
    public void backtracking(String s, int split, int start, List<String> res, Deque<String> path) {
        if (start == s.length()) {
            if (split == 4) {
                // int transfer to string
                res.add(String.join(".", path));
                return;
            }
        }
        if (s.length() - start < 4- split || s.length() - start > 3 * (4 - split)) return;
        for (int i = 0; i < 3; i++) {
            if (start + i >= s.length()) break;
            int substring = isValid(s, start, start + i);
            if (substring != -1) {
                path.offerLast(substring + "");
                backtracking(s, split + 1, start + i + 1, res, path);
                path.removeLast();
            }
        }

    }
}
// @lc code=end

