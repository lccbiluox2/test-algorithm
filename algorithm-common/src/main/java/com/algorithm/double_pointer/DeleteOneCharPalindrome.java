package com.algorithm.double_pointer;

/***
 * todo: 4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/1/31 15:39 4 九师兄
 *
 * 4. 回文字符串
 * 680. Valid Palindrome II (Easy)
 */
public class DeleteOneCharPalindrome {

    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            if (left != right) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
