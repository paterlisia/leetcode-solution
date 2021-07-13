/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);  // do not forget
            if (res.containsKey(sortedString)) res.get(sortedString).add(str);
            else {
                res.put(sortedString, new ArrayList<String>());
                res.get(sortedString).add(str);
            }
        }
        return  new ArrayList<List<String>>(res.values());
    }
}
// @lc code=end

