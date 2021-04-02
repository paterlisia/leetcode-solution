/*
 * @lc app=leetcode.cn id=71 lang=java
 *
 * [71] 简化路径
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<String>();
        String[] charArray = path.split("/");
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i].equals(".") || charArray[i].equals("")) continue;
            else if (charArray[i].equals("..")) 
                {
                    if (!stack.isEmpty())    
                        {
                            stack.pollLast();
                        }
                }
            else {
                stack.offer(charArray[i]);
            }
        }
        StringBuilder sb = new StringBuilder("/");
        while (!stack.isEmpty()) {
            sb.append(stack.poll());
            if (!stack.isEmpty()) sb.append("/");
        }
        return sb.toString().equals("") ? "/" : sb.toString();
    }
}
// @lc code=end

