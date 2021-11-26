package com.algorithm.leetcode.swordoffer.offer30;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-25 19:07
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MinStack2Test {

    MinStack2 method = new MinStack2();

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

}