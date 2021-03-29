/*
 * @lc app=leetcode.cn id=71 lang=java
 *
 * [71] 简化路径
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        Deque<String> q = new ArrayDeque<String>();
        String[] s = path.split("/");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(".") || s[i].equals("")) continue;
            else if (s[i].equals("..")) {
                if (!q.isEmpty()) {
                    q.pollLast();
                }
            } else {
                q.offer(s[i]);
            }
        }
        StringBuilder res = new StringBuilder("/");
        while (!q.isEmpty()) {
            res.append(q.poll());
            if (!q.isEmpty()) res.append("/");
        }
        return res.toString().equals("") ? "/" : res.toString();
    }
}
// @lc code=end

