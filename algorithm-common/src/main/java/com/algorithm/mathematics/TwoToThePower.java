package com.algorithm.mathematics;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-12 20:34
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class TwoToThePower {

    public static boolean isPowerOf2(int num) {
        return (num & num - 1) == 0;
    }

}
