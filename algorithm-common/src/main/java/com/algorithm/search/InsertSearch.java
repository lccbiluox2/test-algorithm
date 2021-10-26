package com.algorithm.search;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-26 22:18
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class InsertSearch {


    public static int insertValueSearch(int[] arr, int left, int right, int findValue) {
        System.out.println("查找次数");
        if (left > right || findValue < arr[0] || findValue > arr[arr.length -1]) {
            return -1;
        }

        int mid = left+(right-left)*(findValue-arr[left])/(arr[right] -arr[left]);
        int midVal = arr[mid];
        // 向右边递归
        if (findValue > midVal) {
            return insertValueSearch(arr, mid + 1, right, findValue);
        } else if (findValue < midVal) {
            return insertValueSearch(arr, left, mid - 1, findValue);
        } else {
            return mid;
        }
    }
}
