/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String s = new String(charArray);
            if (map.containsKey(s)) map.get(s).add(str);
            else {
                map.put(s, new ArrayList<String>());
                map.get(s).add(str);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}
// @lc code=end

