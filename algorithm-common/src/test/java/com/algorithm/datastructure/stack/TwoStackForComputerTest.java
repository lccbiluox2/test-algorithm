package com.algorithm.datastructure.stack;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.*;

public class TwoStackForComputerTest {

    /***
     * todo: 13_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_13  2023/1/31 15:22 13 九师兄
     *     测试点：文章参考：https://blog.csdn.net/qq_43164662/article/details/121578728
     *
     * 应该运行如下
     *     4+2%5-7*11 = -71
     *     但是这里运行是 2 不一样
     */
    @Test
    public void computing() {
        String[] els = {"4", "+", "2", "%", "5", "-", "7", "*", "11"};
        System.out.println(new TwoStackForComputer().computing(els));
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);
        System.out.println(d.peekLast());
    }
}