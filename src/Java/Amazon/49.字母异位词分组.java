/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if (map.containsKey(s)) map.get(s).add(strs[i]);
            else {
                map.put(s, new ArrayList<String>());
                map.get(s).add(strs[i]);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}
// @lc code=end

