package com.algorithm.type.string;


public class MaxLengthSubstring {

    /**
     *todo: 2023/2/21 21:53 九师兄
     * 【算法】空间压缩技巧、两个字符串的最长公共子串
     *  https://blog.csdn.net/qq_21383435/article/details/129149464
     **/
    public static String lcst2(String s1, String s2) {
        if (s1 == null || s2 == null || s1.equals("") || s2.equals("")) {
            return "";
        }
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        // 这两个表示最右上角
        int row = 0; //斜线开始位置的行
        int col = str2.length - 1;//斜线开始位買的列

        int max = 0; // t达到的全局最大值
        int end = 0; //忽略
        while (row < str1.length) {
            int i = row;
            int j = col;
            int len = 0;
            while (i < str1.length && j < str2.length) {
                if (str1[i] != str2[j]) {
                    len = 0;
                } else {
                    len++;
                }
                if (len > max) {
                    end = i;
                    max = len;
                }
                i++;
                j++;
            }
            if (col > 0) {
                col--;
            } else {
                row++;
            }
        }
        return s1.substring(end - max + 1, end + 1);
    }
}
