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
        for (int i = 0; i< prerequisites.length; i++) {
            requireCourses.add(new ArrayList<>());
        }
        for (int[] require : prerequisites) {
            requireCourses.get(require[1]).add(require[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(numCourses, requireCourses, i, used)) return false;
        }
        return true;
    }
    public boolean dfs(int numCourses, List<List<Integer>> requireCourses, int start, int[] used) {
        if (used[start] == 1) return false;
        if (used[start] == -1) return true;
        List<Integer> currentRequire = requireCourses.get(start);
        used[start] = 1;
        for (Integer i : currentRequire) {
            if (!dfs(numCourses, requireCourses, i, used)) return false;
        }
        used[start] = -1;
        return true;
    }
}
// @lc code=end

