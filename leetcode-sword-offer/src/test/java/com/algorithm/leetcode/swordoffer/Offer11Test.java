package com.algorithm.leetcode.swordoffer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-22 22:00
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Offer11Test {

    @Test
    public void minArray() {
        int[] aa =new int[] {3,4,5,1,2};

        Offer11 offer11 = new Offer11();
        int i = offer11.minArray(aa);
        System.out.println(i);
    }

    @Test
    public void minArray1() {
        int[] aa =new int[] {3,4,5,1,2};

        Offer11 offer11 = new Offer11();
        int i = offer11.minArray1(aa);
        System.out.println(i);
    }
}