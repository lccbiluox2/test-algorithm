package com.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-12 17:05
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class RecursiveDemoTest {

    /**
     * 测试点：求数组中的最大值，使用递归
     */
    @Test
    public void process() {
        Integer[] aa = new Integer[]{1,2,3,5,8,3,6,2};
        int process = RecursiveDemo.process(aa, 3, 5);
        System.out.println(process);
    }
}