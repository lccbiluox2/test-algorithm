package com.algorithm.leetcode.swordoffer.offer56;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-11 17:18
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class SingleNumber2Test {

    private SingleNumber2 singleNumber = new SingleNumber2();

    @Test
    public void singleNumbers1_1() {
        int[] data = new int[] {3,5,3,3,4,4,4};
        int ints = singleNumber.singleNumber(data);
        System.out.println(ints);
    }

    @Test
    public void singleNumbers1_2() {
        int[] data = new int[] {9,1,7,9,7,9,7};
        int ints = singleNumber.singleNumber(data);
        System.out.println(ints);
    }

    @Test
    public void singleNumbers2_1() {
        // 0010
        // 0001
        System.out.println(2 >>> 0);
        System.out.println((2 >>> 0) & 1);

        // 0010
        // 0001
        System.out.println(2 >>> 1);
        System.out.println((2 >>> 1) & 1);

        System.out.println(1 >>> 1);
        System.out.println((1 >>> 1) & 1);

        // 0011
        System.out.println(3 >>> 1);
        System.out.println((3 >>> 1) & 1);

    }

}