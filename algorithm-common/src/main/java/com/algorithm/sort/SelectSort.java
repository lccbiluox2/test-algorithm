package com.algorithm.sort;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-17 20:32
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 选择排序
 */
public class SelectSort {

    public static void selectSortDemo2(int[] arr) {
        long l = System.currentTimeMillis();
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            swap(arr, i, minPos);
        }
        long e = System.currentTimeMillis();
        System.out.println(e - l);
        ArraysUtils.printIntArray(arr);
    }

    public static void selectSortDemo1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            swap(arr, i, minPos);
            ArraysUtils.printIntArray(arr);
        }
        ArraysUtils.printIntArray(arr);
    }

    private static void swap(int[] arr, int i, int minPos) {
        int temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
}
