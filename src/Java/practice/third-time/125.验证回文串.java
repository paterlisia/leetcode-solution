/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if (n < 2) return true;

        int left = 0, right = n - 1;
        char a = 'a', b = 'b';
        while (left < right) {

            a = s.charAt(left);
            b = s.charAt(right);
            if (!((a >= '0' && a <= '9') || (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))){

                left++;
                continue;
            }

            if (!((b >= '0' && b <= '9') || (b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z'))){

                right--;
                continue;
            }
            if (a >= 'A' && a <= 'Z') a += 32;
            if (b >= 'A' && b <= 'Z') b += 32;
            if (a != b) return false;
            left++;
            right--;
        }
        return true;
    }
}
// @lc code=end

