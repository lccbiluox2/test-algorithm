package com.algorithm.sort;

import com.algorithm.utils.ArraysUtils;


/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-19 18:03
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class QuickSort {

    /**
     * 希尔排序 针对有序序列在插入时采用交换法
     *
     * @param arr
     */
    public static void quicKSort(int[] arr) {
        ArraysUtils.printIntArray(arr);

        sort(arr, 0, arr.length - 1);

        ArraysUtils.printIntArray(arr);
    }

    private static void sort(int[] arr, int leftBound, int rightBound) {
        if (leftBound >= rightBound) {
            // 如果左边的指针等于右边的指针
            return;
        }
        int mid = partition(arr, leftBound, rightBound);
        sort(arr, leftBound, mid - 1);
        sort(arr, mid + 1, rightBound);
    }


    private static int partition(int[] arr, int leftBound, int rightBound) {
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound - 1;
        while (left < right) {
            while (left <= right && arr[left] <= pivot) {
                left++;

            }
            while (left <= right && arr[right] > pivot) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
            }
        }

        // todo: 这里加入一个判断
        if (arr[left] > arr[rightBound]) {
            swap(arr, left, rightBound);
        }

        return left;
    }

    private static int partition1(int[] arr, int leftBound, int rightBound) {
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound - 1;
        // todo: 这里改成小于等于
        while (left <= right) {
            while (left <= right && arr[left] <= pivot) {
                left++;

            }
            while (left <= right && arr[right] > pivot) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
            }
        }

        swap(arr, left, rightBound);

        return left;
    }

    /**
     * 交换数组元素
     *
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
