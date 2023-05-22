package com.algorithm.leetcode.swordoffer.offer56;

import com.algorithm.swordoffer.offer56.SingleNumber;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-11 09:54
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class SingleNumberTest {

    private SingleNumber singleNumber = new SingleNumber();

    @Test
    public void numberTest() {
        System.out.println( 4 & 4); //4
        System.out.println( 4 | 4); //4

        System.out.println( 4 ^ 4); //0

        System.out.println( 0 ^ 1); //1
        System.out.println( 4 ^ 1); //5

        System.out.println( 4 ^ 1 ^ 4 ); //1

        System.out.println( 4 ^ 1 ^ 4 ^ 6); //7
        System.out.println( 4 ^ 1 & 4 ); //7
        System.out.println( 4 ^ 1 & 6 ); //4
        System.out.println( 4 ^ 1 & 4 ^ 6 ); //2
        System.out.println( 4 ^ 1 ^ 4 ^ 6 ^ 7 ^ 6 ^ 6); //2
    }

    @Test
    public void singleNumbers() {
        int[] data = new int[] {1,2,10,4,1,4,3,3};
        int[] ints = singleNumber.singleNumbers1(data);
        System.out.println(Arrays.toString(ints));
    }
}