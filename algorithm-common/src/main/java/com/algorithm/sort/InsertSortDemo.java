package com.algorithm.sort;

import com.algorithm.utils.ArraysUtils;
import com.algorithm.utils.Tuple2;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-12 15:57
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class InsertSortDemo {

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }

        ArraysUtils.printIntArray(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }


    public static void insertSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            Integer intertData = arr[i];
            for (int j = 0; j < i; j++) {
                int preData = arr[j];
                if (intertData <= preData) {
                    swap(arr, i, j);
                    System.out.println(Arrays.toString(arr));
                }
            }
        }

        ArraysUtils.printIntArray(arr);
    }


    /**
     * 插入排序的优化，将内循环中将较大的元素都往右边移动，而不是总是交换数据
     * 希望这样来提高插入排序的性能
     *
     * @param arr
     */
    public static void insertSortBig(int[] arr) {
        Tuple2<Integer, Integer> maxAndMin = getMaxAndMin(arr);
        int max = maxAndMin.getK().intValue();
        int min = maxAndMin.getV().intValue();

    }

    private static Tuple2<Integer, Integer> getMaxAndMin(int[] arr) {
        int max = 0;
        int min = Integer.MIN_VALUE;
        for (int item : arr) {
            if(item > max){
                max = item;
            }
            if(item < min){
                min = item;
            }
        }
        return Tuple2.of(max,min);
    }
}


