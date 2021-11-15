package com.algorithm.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-12 14:38
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void fib() {
        int fib = solution.fib(100);
        System.out.println(fib);
    }

    @Test
    public void fibSecondTest() {
        long start = System.currentTimeMillis();
        int fib = solution.fibSecond(10);
        System.out.println(fib);
        long end = System.currentTimeMillis();
        System.out.println("用时：" +(end - start));
    }

    /**
     * 349361645
     * 用时：3
     */
    @Test
    public void fibMapTest() {
        long start = System.currentTimeMillis();
        int fib = solution.fibMap(200);
        System.out.println(fib);
        long end = System.currentTimeMillis();
        System.out.println("用时：" +(end - start));
    }

    /**
     * 349361645
     * 用时：0
     *
     * 用时更少了
     */
    @Test
    public void fibNoRecursiveTest() {
        long start = System.currentTimeMillis();
        int fib = solution.fibNoRecursive(200);
        System.out.println(fib);
        long end = System.currentTimeMillis();
        System.out.println("用时：" +(end - start));
    }
}