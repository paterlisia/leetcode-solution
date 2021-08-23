/*
 * @lc app=leetcode.cn id=223 lang=java
 *
 * [223] 矩形面积
 */

// @lc code=start
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int union;
        //没有重叠部分
        if (ax2 <= bx1 || bx2 <= ax1 || ay1 >= by2 || by1 >= ay2) {
            union = 0;
        } else {
            //重叠部分面积
            int a = Math.min(ay2, by2);
            int b = Math.max(ay1, by1);
            int c = a - b;

            int a1 = Math.min(ax2, bx2);
            int b1 = Math.max(ax1, bx1);
            int c1 = a1 - b1;
            union = c * c1;
        }
        //两矩形面积和
        int sum = (ay2 - ay1) * (ax2 - ax1) + (by2 - by1) * (bx2 - bx1);
        return sum - union;

    }
}
// @lc code=end

