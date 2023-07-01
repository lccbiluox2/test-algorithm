package com.algorithm.string;

public class StringShiftLeft {

    /***
     * todo: 九师兄  2023/7/1 18:02
     *
     * 【算法】左旋转字符串，左旋大小大于字符串
     * https://blog.csdn.net/qq_21383435/article/details/131493178
     */
    public String reverseLeftWords(String s, int n) {
        if(s == null || "".equals(s)){
            return s;
        }
        // 长度大于n 需要重新计算N
        if (n > s.length()) {
            n = n % s.length();
        }
        String right = s.substring(0, n);
        String left = s.substring(n, s.length());
        return left + right;
    }
}
