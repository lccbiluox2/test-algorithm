package com.algorithm.sum;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-13 19:17
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 小和问题求解
 */
public class MinSum {

    public static int minSumViolence(int[] args) {
        if (args == null) {
            return 0;
        }
        if (args.length < 1) {
            return args[0];
        }

        int sum = 0;
        for (int index = 0; index < args.length; index++) {
            int right = args[index];
//            System.out.println("右边" + right);

            for (int i = index - 1; 0 <= i; i--) {
                int left = args[i];
//                System.out.println("---左边：" + left);
                if (left < right) {

                    sum = sum + args[i];
                }
            }
        }
        return sum;
    }

    public static int minSumMerge(int[] args) {
        if (args == null) {
            return 0;
        }
        if (args.length < 1) {
            return args[0];
        }
        return process(args, 0, args.length - 1);
    }

    /***
     * todo: 2023/1/2 下午9:22 lcc 九师兄
     *  【算法】归并排序 小和 问题
     *  https://blog.csdn.net/qq_21383435/article/details/120256793
     */
    private static int process(int[] arr, int L, int R) {
        if (L == R) {
            return 0;
        }

        int mid = L + ((R - L) >> 1);

        // 左边的小和
        int left = process(arr, L, mid);
        // 右边的小和
        int right = process(arr, mid + 1, R);
        // 合并的小和
        int merge = merge(arr, L, mid, R);
        return left + right + merge;
    }

    private static int merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        int res = 0;
        // 都不越界的情况
        while (p1 <= M && p2 <= R) {
            // 左边的小于右边的
            res += arr[p1] < arr[p2] ? (R - p2 + 1) * arr[p1] : 0;
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }

//        ArraysUtils.printIntArray(arr);
        return res;
    }
}
