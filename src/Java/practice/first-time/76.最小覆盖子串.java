/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        // map to record needElemnt: count
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int l = 0, r = 0, needCnt = t.length(), minLen = Integer.MAX_VALUE, start = 0;
        while (r < s.length()) {
            // if it is the element which is not added
            if (need.getOrDefault(s.charAt(r), 0) > 0) needCnt--;
            need.put(s.charAt(r), need.getOrDefault(s.charAt(r), 0) - 1);
            // all the elements needed are already in current window
            if (needCnt == 0) {
                // move the left bound untill s end or there will be element needed not in the window
                while (l < r && need.get(s.charAt(l)) < 0) {
                    need.put(s.charAt(l), need.get(s.charAt(l)) + 1);
                    l++;
                }
                // update min length and left bound
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }
                // next window (current window is the min and has been considered)
                if (need.containsKey(s.charAt(l)))
                need.put(s.charAt(l), need.get(s.charAt(l)) + 1);
                // update bound and need count
                l++;
                needCnt++;
            }
            // update right bound to add new element
            r++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
// @lc code=end

