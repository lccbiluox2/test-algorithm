package com.algorithm.sort;

import com.algorithm.utils.ArraysUtils;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-20 09:03
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 基数排序
 */
public class BaseSort {

    public static void baseSort(int[] arr) {

        // 第一步求基数

        int[] result = sort(arr);
    }

    private static int[] sort(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[10];

        for (int i = 0; i < 3; i++) {
            int division = (int) Math.pow(10, i);
            for (int j = 0; j < arr.length; j++) {
                int num = arr[j] / division % 10;
                count[num]++;
            }

            ArraysUtils.printIntArray(arr);

            for (int m = 0; m < count.length; m++) {
                count[m] = count[m] + count[m - 1];
            }

            ArraysUtils.printIntArray(arr);

            for (int n = arr.length - 1; 0 <= 0; n--) {
                int num = arr[n] / division % 10;
                result[--count[num]] = arr[n];
            }

//            System.arraycopy(result,0,arr,0,arr.length);
//            Arrays.fill(count,0);
        }

        return result;

    }

}
