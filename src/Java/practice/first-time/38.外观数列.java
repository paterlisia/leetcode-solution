/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        StringBuffer res = new StringBuffer("1");
        while (n != 1) {
            StringBuffer tmp = new StringBuffer();
            int count = 1;
            for (int i = 0; i < res.length(); i++) {
                if (i == res.length() - 1 || res.charAt(i) != res.charAt(i + 1)) {
                    tmp.append((char) (count + '0'));
                    tmp.append(res.charAt(i));
                    count = 1;
                } else if (res.charAt(i) == res.charAt(i + 1)) {
                    count++;
                }
            }
            res = tmp;
            n--;
        }
        return res.toString();
    }
}
// @lc code=end

