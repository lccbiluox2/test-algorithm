package com.algorithm.sort;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-12 18:05
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MergeSort {

    public static void mergeSort(Integer[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }

    private static void process(Integer[] arr, int L, int R) {
        // 如果只有一个数 就不排序了
        if (L == R) {
            return;
        }

        int mid = L + ((R - L) >> 1);
        // 左侧有序
        process(arr, L, mid);
        // 右侧有序
        process(arr, mid + 1, R);
        // 合并
        merge(arr, L, mid, R);
    }

    private static void merge(Integer[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        // 两边都不越界的时候
        while (p1 <= M && p2 <= R) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 其中一个越界了

        // 如果是p1没有越界，那么就拷贝p1剩下的东西
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }

        // 如果是p2没有越界，那么就拷贝p2剩下的东西
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }


        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }

        ArraysUtils.printIntArray(arr);
    }
}
