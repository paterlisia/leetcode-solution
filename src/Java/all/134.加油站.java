/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0;
        while (start < n) {
            int cnt = 0;
            int gasLeft = 0;
            while (cnt < n) {
                int j = (start + cnt) % n;
                gasLeft += gas[j];
                gasLeft -= cost[j];
                if (gasLeft < 0) break;
                cnt++;
            }
            if (cnt == n) return start;
            else start = start + cnt + 1;
        }
        return -1;
    }
}
// @lc code=end

