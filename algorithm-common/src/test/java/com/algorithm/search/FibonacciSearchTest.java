package com.algorithm.search;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-30 14:57
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * todo: 斐波那契 https://blog.csdn.net/qq_21383435/article/details/121047816
 */
public class FibonacciSearchTest {

    /**
     * 测试点： 测试斐波拉契 非递归的查找算法
     * 测试结果：
     * 2
     */
    @Test
    public void fibSearch() {
        int[] arr = {1, 8, 10, 89, 1000,1234};
        Integer aa = FibonacciSearch.fibSearch(arr, 10);
        System.out.println(aa);
    }
}