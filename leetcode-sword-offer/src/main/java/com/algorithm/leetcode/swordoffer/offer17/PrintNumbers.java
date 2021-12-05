package com.algorithm.leetcode.swordoffer.offer17;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-05 12:11
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class PrintNumbers {

    public int[] printNumbers(int n) {
        int max = getMax(n);
        int[] data = new int[max];
        for (int i = 0; i < max; i++) {
            data[i] = i;
        }
        return data;
    }


    private int getMax(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            builder.append("9");
        }
        return Integer.parseInt(builder.toString());
    }
}
