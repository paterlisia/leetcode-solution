/*
 * @lc app=leetcode.cn id=71 lang=java
 *
 * [71] 简化路径
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        StringBuffer res = new StringBuffer("/");
        String[] pathArray = path.split("/");
        Deque<String> category = new ArrayDeque<String>();
        for (int i = 0; i < pathArray.length ; i++) {
            if (pathArray[i].equals(".") || pathArray[i].equals("")) continue;
            else if (pathArray[i].equals("..")) {
                if (!category.isEmpty()) {
                    category.pollLast();
                }
            }
            else category.offer(pathArray[i]);
        }
        while (!category.isEmpty()) {
            res.append(category.poll());
            if (!category.isEmpty()) res.append("/");
        }
        return res.toString().equals("") ? "/" : res.toString();
    }
}
// @lc code=end

