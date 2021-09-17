package com.algorithm.sort;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-17 20:58
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BubblingSort {

    public static void bubblingSort(int[] arr) {

        ArraysUtils.printIntArray(arr);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <= arr.length - 1; j++) {
                int nextIndex = j + 1;
                if (nextIndex >= arr.length) {
                    break;
                }
                if (arr[j] > arr[nextIndex]) {
                    ArraysUtils.swap(arr, j, nextIndex);

                }
                ArraysUtils.printIntArray(arr);
            }

        }
    }

    public static void bubblingSort1(int[] arr) {

        ArraysUtils.printIntArray(arr);

        for (int i = 0; i < arr.length; i++) {
            int sortEnd = arr.length - i;
            for (int j = 0; j <= arr.length - 1; j++) {
                int nextIndex = j + 1;
                if (nextIndex >= arr.length) {
                    break;
                }
                if (sortEnd == j) {
                    break;
                }
                if (arr[j] > arr[nextIndex]) {
                    ArraysUtils.swap(arr, j, nextIndex);

                }
                ArraysUtils.printIntArray(arr);
            }

        }
    }


    public static void bubblingSort2(int[] arr) {

        ArraysUtils.printIntArray(arr);

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArraysUtils.swap(arr, j, j + 1);
                }
                ArraysUtils.printIntArray(arr);
            }
        }
    }

    public static void bubbleSort(int arr[]) {
        boolean didSwap;
        for(int i = 0, len = arr.length; i < len - 1; i++) {
            didSwap = false;
            for(int j = 0; j < len - i - 1; j++) {
                if(arr[j + 1] < arr[j]) {
                    ArraysUtils.swap(arr, j, j + 1);
                    didSwap = true;
                }
                ArraysUtils.printIntArray(arr);
            }
            if(didSwap == false)
                return;

        }
    }
}
