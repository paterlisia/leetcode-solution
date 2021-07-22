/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; ) {
            int j = 0;
        int totalGas = 0, totalCost = 0;
            for (; j < gas.length; j++) {
                totalGas += gas[(i + j) % gas.length];
                totalCost += cost[(i + j) % gas.length];
                if (totalCost > totalGas) break;
            }
            if (j == gas.length) return i;
            else i = i + j + 1;
        }
        return -1;
    }
}
// @lc code=end

