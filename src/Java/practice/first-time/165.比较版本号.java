/*
 * @lc app=leetcode.cn id=165 lang=java
 *
 * [165] 比较版本号
 */

// @lc code=start
class Solution {
    public int compareVersion(String version1, String version2) {
        for (int i = 0, j = 0; i < version1.length() || j < version2.length(); i++, j++) {
            int n1 = 0, n2 = 0;
            while (i < version1.length() && version1.charAt(i) != '.') n1 = n1 * 10 + version1.charAt(i++) - '0';
            while (j < version2.length() && version2.charAt(j) != '.') n2 = n2 * 10 + version2.charAt(j++) - '0';
            if (n1 > n2) return 1;
            else if (n1 < n2) return -1;
        }
        return 0;
    }
}
// @lc code=end

