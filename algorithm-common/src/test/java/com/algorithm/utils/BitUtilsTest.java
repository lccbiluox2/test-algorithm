package com.algorithm.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-02 16:18
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BitUtilsTest {

    /**
     * 测试点：测试二进制的打印
     */
    @Test
    public void print() {
        String s = Integer.toBinaryString(7);
        System.out.println(s);

        BitUtils.print(2);
        BitUtils.print(4);
        BitUtils.print(5);
        BitUtils.print(7);
    }
}