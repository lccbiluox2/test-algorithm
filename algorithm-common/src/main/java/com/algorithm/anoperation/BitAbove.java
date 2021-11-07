package com.algorithm.anoperation;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-02 10:41
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BitAbove {

    public static int[] sortByBits(int[] arr) {
        int length = arr.length;
        //数组中每个数字的二进制位乘以100000再加上原来的数值，
        //成为一个新的数
        //0 = 100002
        //1 = 200003
        //2 = 200005
        //3 = 300007
        //4 = 300011
        //5 = 300013
        //6 = 200017
        //7 = 300019
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.bitCount(arr[i]) * 100000 + arr[i];
        }
        //对这个新的数进行排序
        //0 = 100002
        //1 = 200003
        //2 = 200005
        //3 = 200017
        //4 = 300007
        //5 = 300011
        //6 = 300013
        //7 = 300019
        Arrays.sort(arr);
        //然后再把新的数字还原成原来的数字
        for (int i = 0; i < length; i++) {
            arr[i] %= 100000;
        }
        return arr;
    }





}
