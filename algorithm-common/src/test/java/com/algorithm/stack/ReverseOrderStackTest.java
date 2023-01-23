package com.algorithm.stack;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class ReverseOrderStackTest {

    @Test
    public void reverse() {
    }

    /**
     * todo:  16_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_16  2023/1/23 下午4:08 九师兄
     *     测试点: 测试逆序栈结构 只能使用函数 不能使用额外的数据结构
     *     比如这个栈 1 2 3 直接出栈是1 ，但是需要有个函数 栈出的是3
     *  测试结果：
     *  输出结果就是3
     *
     *  【算法】不使用额外储存空间，逆序栈
     *  https://blog.csdn.net/qq_21383435/article/details/128753001
     */
    @Test
    public void f() {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        int f = ReverseOrderStack.f(stack);
        System.out.println(f);
    }
}