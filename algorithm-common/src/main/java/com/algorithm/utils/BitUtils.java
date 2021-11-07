package com.algorithm.utils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-02 16:17
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BitUtils {

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

}
