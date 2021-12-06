package com.algorithm.leetcode.swordoffer.offer40;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-05 13:46
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 剑指 Offer 40. 最小的k个数
 */
public class MinKNums {

    /**
     * 第一种排序解决
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        quicKSort(arr);

        // 如果数据长度大于要获取的长度 取k
        int size = 0;
        if(arr.length > k){
            size = k;
        }else {
            // 否则就是要取的数据比值还长，那么取数组的长度
            size = arr.length;
        }
        int[] result = new int[size];
        for (int i = 0; i < k; i++) {
            if(i >= arr.length){
                break;
            }
            result[i] = arr[i];
        }
        return result;
    }


    /**
     * 希尔排序 针对有序序列在插入时采用交换法
     *
     * @param arr
     */
    public  void quicKSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private  void sort(int[] arr, int leftBound, int rightBound) {
        if (leftBound >= rightBound) {
            // 如果左边的指针等于右边的指针
            return;
        }
        int mid = partition(arr, leftBound, rightBound);
        sort(arr, leftBound, mid - 1);
        sort(arr, mid + 1, rightBound);
    }


    private  int partition(int[] arr, int leftBound, int rightBound) {
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
