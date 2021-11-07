package com.algorithm.anoperation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-02 13:45
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BitAddSubTest {

    @Test
    public void add1Test() {
        int i = BitAddSub.add1(1, 2);
        System.out.println(i);
    }

    @Test
    public void add1Test1() {
        int i = BitAddSub.add1(3, 2);
        System.out.println(i);
    }


    @Test
    public void hasAlternatingBitsTest() {
        boolean result = BitAddSub.hasAlternatingBits(2);
        System.out.println(result);
    }

    @Test
    public void hasAlternatingBitsTest1() {
        boolean result = BitAddSub.hasAlternatingBits(7);
        System.out.println(result);
    }
}