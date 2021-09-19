package com.algorithm.sort;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-19 13:47
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 希尔排序
 */
public class ShellSort {


    /**
     * 希尔排序 针对有序序列在插入时采用交换法
     *
     * @param arr
     */
    public static void sort2(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap = 4; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; gap - 1 < j; j -= gap) {
                    if (arr[j] < arr[j - gap]) {
                        //插入排序采用交换法
                        swap(arr, j, j - gap);
                    }
                }
            }
        }
        ArraysUtils.printIntArray(arr);
    }

    /**
     * 希尔排序 针对有序序列在插入时采用交换法
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    //插入排序采用交换法
                    swap(arr, j, j - gap);
                    j -= gap;
                }
            }
        }
        ArraysUtils.printIntArray(arr);
    }


    public static void kunthSort(int[] arr) {
        int h = 1;
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }
        System.out.println("间隔大小：" + h);

        //增量gap，并逐步缩小增量
        for (int gap = h; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    //插入排序采用交换法
                    swap(arr, j, j - gap);
                    j -= gap;
                }
            }
        }
        ArraysUtils.printIntArray(arr);
    }


    /**
     * 希尔排序 针对有序序列在插入时采用移动法。
     *
     * @param arr
     */
    public static void sort1(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        //移动法
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 交换数组元素
     *
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

}
