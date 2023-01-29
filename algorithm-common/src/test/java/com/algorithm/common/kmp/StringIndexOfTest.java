package com.algorithm.common.kmp;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringIndexOfTest {

    /**
     * todo:  10_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_10  2023/1/29 09:32 九师兄
     *     测试点: 因为 StringMatch 【KMP】KMP 字符串匹配算法
     *     学了这个之后我感觉kmp挺牛逼的，就想知道 kmp 算法有没有在 indexOf 方法中使用
     *     这里进行调试一下
     *
     *     查看貌似没有使用kmp算法
     *
     *     java库的代码是暴力解的，可是库的indexOf要比KMP快上百倍
     *     https://blog.csdn.net/qq_40674583/article/details/87887178
     *
     *
     * indexOf 逻辑比较简单：两层for循环暴力查找。
     *
     * 为什么Java String indexOf 没有使用更加“高效”的算法
     *
     * 总结起来有两点：
     * ① 高效的算法BM和KMP都是需要空间作为代价的，特别是BM，任何一个字符串都需要至少64K内存，
     *   考虑到L1 Cache大小，cost更不可知。
     * ② JDK应该默认了不会使用Java String.indexOf查找过大的字符串，对于轻量级（通常不超过几十
     *   个字符），及时暴力用时也非常短。这也提示，Java String.indexOf的客户端程序员应该对于自己
     *   使用的API有所了解，如果要进行过大的字符串查找，应该自己设计算法（取出两个字符串的value[]，
     *   然后实现BM或KMP）或调用第三方工具专门处理。
     *
     * 原文链接：https://blog.csdn.net/ProLayman/article/details/118031534
     */
    @Test
    public void stringIndexOfTest(){
        String aa = "5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29";
        int paH = aa.indexOf("paH");
        System.out.println(paH);
    }

    /**
     * todo:  23_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_23  2023/1/29 09:38 九师兄
     *     测试点: contains 使用了 indexOf(s.toString())
     */
    @Test
    public void containsTest(){
        String aa = "5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29";
        boolean paH = aa.contains("paH");
        System.out.println(paH);
    }
}