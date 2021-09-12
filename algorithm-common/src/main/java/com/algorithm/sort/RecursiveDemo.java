package com.algorithm.sort;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-12 17:02
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class RecursiveDemo {

    public static int process(Integer[] arr, int L, int R) {
        if (L == R) {
            return arr[L];
        }
        int mid = L + ((R - L) >> 1);//中点
        int leftMax = process(arr,L,mid);
        int rightMax = process(arr,mid+1,R);
        return Math.max(leftMax,rightMax);
    }
}
