package com.algorithm.utils;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-12 16:02
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ArraysUtils {
    public static void printIntArray(Integer[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printIntArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] arr, int i, int minPos) {
        int temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }

    /**
     * 打印二维数组
     * @param chessArra
     */
    public static void printIntTowArray(int[][] chessArra) {
        for (int[] ints : chessArra) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println();
        }
    }
}
