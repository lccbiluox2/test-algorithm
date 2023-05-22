package com.algorithm.leetcode.swordoffer.offer40;

import com.algorithm.swordoffer.offer40.MinKNums1;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-05 18:59
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MinKNums1Test {

    MinKNums1 minKNums = new MinKNums1();

    @Test
    public void getLeastNumbers2_1() {
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


        data = new int[]{0,0,2,3,2,1,1,2,0,4};
        leastNumbers = minKNums.getLeastNumbers(data, 10);
        System.out.println(Arrays.toString(leastNumbers));


        data = new int[]{3,2,1};
        leastNumbers = minKNums.getLeastNumbers(data, 2);
        System.out.println(Arrays.toString(leastNumbers));

    }


    @Test
    public void getLeastNumbers3_1() {
        int[] data = new int[]{3, 4, 6, 8, 2, 11, 6, 3, 2, 9};
        int[] leastNumbers = minKNums.getLeastNumbers3(data, 4);
        System.out.println(Arrays.toString(leastNumbers));
    }

    @Test
    public void getLeastNumbers4_1() {
        int[] data = new int[]{3, 4, 6, 8, 2, 11, 6, 3, 2, 9};
        int[] leastNumbers = minKNums.getLeastNumbers4(data, 4);
        System.out.println(Arrays.toString(leastNumbers));
    }

    @Test
    public void getLeastNumbers5_1() {
        int[] data = new int[]{3, 4, 6, 8, 2, 11, 6, 3, 2, 9};
        int[] leastNumbers = minKNums.getLeastNumbers5(data, 4);
        System.out.println(Arrays.toString(leastNumbers));
    }
}