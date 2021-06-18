/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = 0;
        while (n < gas.length) {
            int sumofGas = 0, sumofCost = 0;
            int cnt = 0;
            while (cnt < gas.length) {
                int j = (cnt + n) % gas.length;
                sumofCost += cost[j];
                sumofGas += gas[j];
                if (sumofGas < sumofCost) break;
                cnt++;
            }
            if (cnt == gas.length) return n;
            else n = n + cnt + 1;
        }
        return -1;
    }
}
// @lc code=end

