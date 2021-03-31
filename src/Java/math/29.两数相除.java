/*
 * @lc app=leetcode.cn id=29 lang=java
 *
 * [29] 两数相除
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
        return Integer.MAX_VALUE;
    
    boolean k=(dividend>0&&divisor>0)||(dividend<0&&divisor<0);
    int result=0;
    dividend=-Math.abs(dividend);
    divisor=-Math.abs(divisor);
    while(dividend<=divisor) {
        int temp=divisor;
        int c=1;
        while(dividend-temp<=temp) {
            temp=temp<<1;
            c=c<<1;
        }
        dividend-=temp;
        result+=c;
    }
    return k?result:-result;
    }
}
// @lc code=end

