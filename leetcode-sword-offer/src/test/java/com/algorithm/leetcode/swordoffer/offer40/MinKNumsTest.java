package com.algorithm.leetcode.swordoffer.offer40;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-05 13:51
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MinKNumsTest {

    MinKNums minKNums = new MinKNums();

    @Test
    public void getLeastNumbers() {
        int[] data = new int[]{3,4,6,8,2,11,6,3,2,9};
        int[] leastNumbers = minKNums.getLeastNumbers(data, 4);
        System.out.println(Arrays.toString(leastNumbers));

        leastNumbers = minKNums.getLeastNumbers(data, 0);
        System.out.println(Arrays.toString(leastNumbers));

        data = new int[]{3,4};
        leastNumbers = minKNums.getLeastNumbers(data, 3);
        System.out.println(Arrays.toString(leastNumbers));

        data = new int[]{};
        leastNumbers = minKNums.getLeastNumbers(data, 3);
        System.out.println(Arrays.toString(leastNumbers));

    }

    @Test
    public void getLeastNumbers1_1() {

        int[] data = new int[]{0,0,2,3,2,1,1,2,0,4};
        int[] leastNumbers = minKNums.getLeastNumbers(data, 10);
        System.out.println(Arrays.toString(leastNumbers));


    }

    @Test
    public void getLeastNumbers1_2() {

        int[] data = new int[]{3,2,1};
        int[] leastNumbers = minKNums.getLeastNumbers(data, 2);
        System.out.println(Arrays.toString(leastNumbers));


    }



}