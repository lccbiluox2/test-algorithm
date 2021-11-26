package com.algorithm.leetcode.swordoffer.offer30;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-25 17:20
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MinStackTest {

    MinStack method = new MinStack();

    @Test
    public void push() {

        method.push(-2);
        method.push(0);
        method.push(-3);
        int min = method.min();
        System.out.println(min);
        method.pop();
        method.pop();
        int top = method.top();
        int min1 = method.min();
        System.out.println(top);
        System.out.println(min1);

    }

    @Test
    public void push1() {

        method.push(2);
        method.push(3);
        method.push(4);
        method.push(5);
        int min = method.min();
        System.out.println(min);
        method.pop();
        method.pop();
        int top = method.top();
        int min1 = method.min();
        System.out.println(top);
        System.out.println(min1);

    }

    @Test
    public void push2() {

        method.push(2);
        method.push(5);
        method.push(4);
        method.push(3);
        method.push(6);
        int min = method.min();
        System.out.println(min);
        method.pop();
        method.pop();
        int top = method.top();
        int min1 = method.min();
        System.out.println(top);
        System.out.println(min1);

    }

    /**
     * 测试结果：
     *
     * 插入数据：5
     * 当前数据栈：[5]
     * 当前最小值栈：[5]
     *
     * 插入数据：3
     * 当前数据栈：[5, 3]
     * 当前最小值栈：[5, 3]
     *
     * 插入数据：4
     * 当前数据栈：[5, 3, 4]
     * 当前最小值栈：[5, 3]
     *
     * 插入数据：1
     * 当前数据栈：[5, 3, 4, 1]
     * 当前最小值栈：[5, 3, 1]
     *
     * 插入数据：6
     * 当前数据栈：[5, 3, 4, 1, 6]
     * 当前最小值栈：[5, 3, 1]
     *
     * 1
     * 当前数据栈：[5, 3, 4, 1]
     * 当前最小值栈：[5, 3, 1]
     *
     * 当前数据栈：[5, 3, 4]
     * 当前最小值栈：[5, 3]
     *
     * 4
     * 3
     *
     */
    @Test
    public void push3() {

        method.push(5);
        method.push(3);
        method.push(4);
        method.push(1);
        method.push(6);
        int min = method.min();
        System.out.println(min);
        method.pop();
        method.pop();
        int top = method.top();
        int min1 = method.min();
        System.out.println(top);
        System.out.println(min1);

    }


    @Test
    public void push4() {

        method.push(2);
        method.push(0);
        method.push(3);
        method.push(0);

        int min = method.min();
        System.out.println(min);
        method.pop();

        min = method.min();
        System.out.println(min);
        method.pop();

        min = method.min();
        System.out.println(min);
        method.pop();

        min = method.min();
        System.out.println(min);

    }

    @Test
    public void push5() {

        method.push(0);
        method.push(1);
        method.push(0);


        int min = method.min();
        method.pop();

        min = method.min();

        System.out.println();


    }

}