/*
 * @lc app=leetcode.cn id=71 lang=java
 *
 * [71] 简化路径
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        String[] splited = path.split("/");
        Deque<String> pathStack = new ArrayDeque<>();
        for (int i = 0; i < splited.length; i++) {
            if (splited[i].equals(".") || splited[i].equals("")) continue;
            else if (splited[i].equals("..")) {
                if (!pathStack.isEmpty()) {
                    pathStack.pollLast();
                }
            }
            else pathStack.offer(splited[i]);
        }
        StringBuilder sb = new StringBuilder("/");
        while (!pathStack.isEmpty()) {
            sb.append(pathStack.poll());
            if (!pathStack.isEmpty()) sb.append("/");
        }
        return sb.toString().equals("") ? "/" : sb.toString();
    }
}
// @lc code=end

