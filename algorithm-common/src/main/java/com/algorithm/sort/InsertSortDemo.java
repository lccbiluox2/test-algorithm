package com.algorithm.sort;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-12 15:57
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class InsertSortDemo {

    public static void insertSort(Integer[] arr) {
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i=1;i< arr.length;i++){
            for (int j = i-1;j>=0 && arr[j] > arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }

        ArraysUtils.printIntArray(arr);
    }

    public static void swap(Integer[] arr ,int i ,int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}


