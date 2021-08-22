/*
 * @lc app=leetcode.cn id=207 lang=java
 *
 * [207] 课程表
 */

// @lc code=start
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> requireCourses = new ArrayList<>();
        int[] used = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            requireCourses.add(new ArrayList<Integer>());
        }
        for (int[] pre: prerequisites) {
            requireCourses.get(pre[1]).add(pre[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, used, requireCourses)) return false;
        }
        return true;
    }
    public boolean dfs(int j, int[] used, List<List<Integer>> requireCourses) {
        if (used[j] == 1) return false;
        if (used[j] == -1) return true;
        used[j] = 1;
        for (Integer i: requireCourses.get(j)) {
            if (!dfs(i, used, requireCourses)) return false;
        }
        used[j] = -1;
        return true;
     }
}
// @lc code=end

