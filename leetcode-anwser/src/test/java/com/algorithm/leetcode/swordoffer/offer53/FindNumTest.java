package com.algorithm.leetcode.swordoffer.offer53;

import com.algorithm.swordoffer.offer53.FindNum;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-27 14:07
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class FindNumTest {

    FindNum findNum = new FindNum();

    @Test
    public void findRepeatNumber1() {
        int[] data = new int[]{1,2,3,5,7,7};
        int repeatNumber = findNum.search(data,7);
        System.out.println("数字有："+repeatNumber);
    }

    @Test
    public void findRepeatNumber2() {
        int[] data = new int[]{5,7,7,8,8,10};
        int repeatNumber = findNum.search(data,6);
        System.out.println("数字有："+repeatNumber);
    }


    @Test
    public void findRepeatNumber4() {
        int[] data = new int[]{5,7,7,8,8,10};
        int repeatNumber = findNum.search1(data,6);
        System.out.println("数字有："+repeatNumber);
    }


    @Test
    public void findRepeatNumber3() {
        int[] data = new int[]{5,6,7,7,8};
        int repeatNumber = findNum.search1(data,7);
        System.out.println("数字有："+repeatNumber);
    }

    @Test
    public void findRepeatNumber5() {
        int[] data = new int[]{1,3,4,5,7,7,8,8,10};
        int repeatNumber = findNum.search1(data,6);
        System.out.println("数字有："+repeatNumber);
    }
}