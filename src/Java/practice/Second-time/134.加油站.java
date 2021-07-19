/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length;) {
            int count = 0;
            int totalGas = 0, totalCost = 0;
            while (count < gas.length) {
                int index = (i + count) % gas.length;
                totalCost += cost[index];
                totalGas += gas[index];
                if (totalCost > totalGas) break;
                count++;
            }
            if (count == gas.length) return i;
            i = (i + count) + 1;
        }
        return -1;
    }
}
// @lc code=end

