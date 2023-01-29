package com.algorithm.common.kmp;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-13 18:51
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 【KMP】KMP 字符串匹配算法
 * https://blog.csdn.net/qq_21383435/article/details/121308297
 */
public class StringMatch {


    //暴力匹配算法实现
    public static int vịolenceMatch(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int s1Len = s1.length;
        int s2Len = s2.length;
        int i = 0; //i索 引指向s1
        int j = 0; //j索引指向s2
        while (i < s1Len && j < s2Len) {
            if (s1[i] == s2[j]) { // 匹配ok
                i++;
                j++;
            } else {
                //没有匹配成功
                // 如果匹配失败  //如果失配(即str1[i]! = str2[j]),令i=i(j-1),j=0
                i = i - (j - 1);
                j = 0;
            }
        }
        if (j == s2Len) {
            return i - j;
        }
        return -1;
    }


    public static int kmpMatch(String source, String target) {
        int[] next = kmpNext(target);
        int i = kmpSearch(source, target, next);
        return i;
    }

    /**
     * @param str1 源字符串
     * @param str2 子串
     * @param next 部分匹配表，是子串对 应的部分匹配表
     * @return 如果是-1就是没有匹配到，否则返回第一个匹配的位置
     */
    public static int kmpSearch(String str1, String str2, int[] next) {
        for (int i = 0, j = 0; i < str1.length(); i++) {

            //需要挫理str1.charAt(i) ! = str2. charAt(j),去凋整j的大小
            //KMP算法核心点. 难以理解
            while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
                j = next[j - 1];
            }

            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {//1i]7 1/j=3 i
                return i - j + 1;
            }
        }
        return -1;
    }


    /**
     * 测试生成kmp的部分匹配表
     *
     * @param dest
     * @return
     */
    public static int[] kmpNext(String dest) {
        //创建一个next数组保存部分匹配值
        int[] next = new int[dest.length()];
        next[0] = 0; //如果字符串是长度为1部分匹配值就是0

        for (int i = 1, j = 0; i < dest.length(); i++) {
            //当dest.charAt(i) != dest. charAt(j) , 我们需要从next[j-1]获取新的j
            //直到我们发现有dest. charAt(i) == dest. charAt(j)成立才退出
            //这时kmp算法的核心点
            while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j - 1];
            }
            //当dest. charAt(i) ==. dest . charAt(j)满足时，部分匹配值就是+1
            if (dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
