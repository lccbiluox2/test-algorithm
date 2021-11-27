package com.algorithm.leetcode.swordoffer.offer53;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-27 19:09
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class FindMissingNumTest {


    FindMissingNum findMissingNum = new FindMissingNum();

    @Test
    public void missingNumber() {
        int[] data = new int[]{0, 1, 2, 3, 5};
        int repeatNumber = findMissingNum.missingNumber(data);
        System.out.println("数字有：" + repeatNumber);
    }

    @Test
    public void missingNumber1() {
        int[] data = new int[]{0, 1, 2, 3, 7};
        int repeatNumber = findMissingNum.missingNumber(data);
        System.out.println("数字有：" + repeatNumber);
    }

    @Test
    public void missingNumber2() {
        int[] data = new int[]{0};
        int repeatNumber = findMissingNum.missingNumber(data);
        System.out.println("数字有：" + repeatNumber);
    }

    @Test
    public void missingNumber3() {
        int[] data = new int[]{1};
        int repeatNumber = findMissingNum.missingNumber(data);
        System.out.println("数字有：" + repeatNumber);
    }

    @Test
    public void missingNumber4() {
        int[] data = new int[]{0,1};
        int repeatNumber = findMissingNum.missingNumber(data);
        System.out.println("数字有：" + repeatNumber);
    }

    @Test
    public void missingNumber5() {
        int[] data = new int[]{1,2};
        int repeatNumber = findMissingNum.missingNumber(data);
        System.out.println("数字有：" + repeatNumber);
    }


    /**
     * 数字有：0
     * 数字有：2
     * 数字有：0
     * 数字有：1
     * 数字有：4
     */
    @Test
    public void leetcode1() {
        int[] data = new int[]{1,2};
        int repeatNumber = findMissingNum.missingNumber(data,2);
        System.out.println("数字有：" + repeatNumber);

        data = new int[]{0,1};
        repeatNumber = findMissingNum.missingNumber(data,2);
        System.out.println("数字有：" + repeatNumber);

        data = new int[]{1};
        repeatNumber = findMissingNum.missingNumber(data,data.length);
        System.out.println("数字有：" + repeatNumber);

        data = new int[]{0};
        repeatNumber = findMissingNum.missingNumber(data,data.length);
        System.out.println("数字有：" + repeatNumber);

        data = new int[]{0, 1, 2, 3, 7};
        repeatNumber = findMissingNum.missingNumber(data,data.length);
        System.out.println("数字有：" + repeatNumber);
    }

    @Test
    public void leetcode3() {
        int[] data = new int[]{1,2};
        int repeatNumber = findMissingNum.missingNumber3(data);
        System.out.println("数字有：" + repeatNumber);

        data = new int[]{0,1};
        repeatNumber = findMissingNum.missingNumber3(data);
        System.out.println("数字有：" + repeatNumber);

        data = new int[]{1};
        repeatNumber = findMissingNum.missingNumber3(data);
        System.out.println("数字有：" + repeatNumber);

        data = new int[]{0};
        repeatNumber = findMissingNum.missingNumber3(data);
        System.out.println("数字有：" + repeatNumber);

        // todo: 可以看到这个计算的不对
        data = new int[]{0, 1, 2, 3, 7};
        repeatNumber = findMissingNum.missingNumber3(data);
        System.out.println("数字有：" + repeatNumber);
    }

}