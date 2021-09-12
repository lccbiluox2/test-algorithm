package com.algorithm.swap;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-12 12:40
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class SwapTwo {

    public static void swapTwoData() {
        int a = 1;
        int b = 2;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);
    }

    public static void swapTwoData1(Integer[] arr ,int i ,int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];

        System.out.println(arr[i] + " " + arr[j]);
    }
}
