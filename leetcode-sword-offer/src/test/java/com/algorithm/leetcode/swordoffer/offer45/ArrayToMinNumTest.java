package com.algorithm.leetcode.swordoffer.offer45;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-12 20:38
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ArrayToMinNumTest {

    private ArrayToMinNum arrayToMinNum = new ArrayToMinNum();

    @Test
    public void minNumber1_1() {
        int i = ("1" + "2").compareTo("2" + "1");
        System.out.println(i);
        System.out.println( ("30" + "2").compareTo("2" + "30"));
    }

    @Test
    public void minNumber() {
        int[] data = new int[]{2,30,34,1,9};
        String s = arrayToMinNum.minNumber(data);
        System.out.println(s);
    }
}