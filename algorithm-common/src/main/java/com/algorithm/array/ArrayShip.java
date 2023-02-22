package com.algorithm.array;

public class ArrayShip {

    /**
     *todo: 2023/2/22 22:34 九师兄
     * 【算法】N个人坐船，求最少需要的船的个数
     * https://blog.csdn.net/qq_21383435/article/details/129151926
     **/
    // 请保证array有序
    public static int minBoat(int[] arr, int limit) {
        // arr排个序
        if (arr == null || arr.length == 0) {
            return 0;
        }
        // 如果数组中 有一个数大于limit 那么无论使用多少个船都装不下
        if (arr[arr.length - 1] > limit) {
            return Integer.MIN_VALUE;
        }

        // 遍历数组，如果所有的数据都小于  (limit / 2) 此时最少能用N/2条船
        if (arr[arr.length - 1] <= (limit / 2)) {
            // +1 是为了向上取整 一个小技巧
            return (arr.length + 1) / 2;
        }

        // 寻找 limit/2 最右边的位置
        int lessR = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= (limit / 2)) {
                lessR = i;
                break;
            }
        }
        // 没有小于 limit/2 的数据，默认有多少数据 就是多少条船
        if (lessR == -1) {
            return arr.length;
        }
        int L = lessR;
        int R = lessR + 1;
        int lessUnused = 0;
        while (L >= 0) {
            int solved = 0;
            while (R < arr.length && arr[L] + arr[R] <= limit) {
                R++;
                solved++;
            }
            if (solved == 0) {
                lessUnused++;
                L--;
            } else {
                L = Math.max(-1, L - solved);
            }
        }
        int lessAll = lessR + 1;//  左半区总个数<= limit /2的区域
        int lessUsed = lessAll - lessUnused; // 画对号的数据量
        int moreUnsolved = arr.length - lessR - 1 - lessUsed; // 大于 limit/2 区中，没搞定的数量
        return lessUsed + ((lessUnused + 1) >> 1) + moreUnsolved;
    }
}
