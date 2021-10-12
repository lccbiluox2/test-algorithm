package com.algorithm.mathematics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-12 20:35
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class TwoToThePowerTest {

    @Test
    public void isPowerOf2() {
        boolean powerOf2 = TwoToThePower.isPowerOf2(100);
        System.out.println(powerOf2);
    }
}