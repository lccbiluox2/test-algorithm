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
     * 参考： java - Why does String.indexOf() not use KMP? - Stack Overflow
     *
     * 原来JDK的编写者们认为大多数情况下，字符串都不长，使用原始实现可能代价更低。
     * 因为KMP和Boyer-Moore算法都需要预先计算处理来获得辅助数组，需要一定的时间和空间，这可能
     * 在短字符串查找中相比较原始实现耗费更大的代价。在短字符串测试过程中，使用indexOf方法时要比
     * KMP算法要快一点。KMP算法对与超长字符串子匹配速度上是优于IndexOf的。
     *
     * 因为KMP算法需要预先计算处理来获得辅助数组，需要一定的时间和空间，这可能在短字符串查找中相比
     * 较原始实现耗费更大的代价。
     *
     * 而且一般大字符串查找时，程序员们也会使用其它特定的数据结构，查找起来更简单。这有点类似于
     * 排除特定情况下的快速排序了。不同环境选择不同算法。
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
     * https://blog.csdn.net/zzhongcy/article/details/128726066
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