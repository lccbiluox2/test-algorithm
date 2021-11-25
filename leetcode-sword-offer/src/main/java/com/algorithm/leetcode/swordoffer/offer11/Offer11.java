package com.algorithm.leetcode.swordoffer.offer11;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-22 21:57
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Offer11 {

    public int minArray(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
        return numbers[0];
    }

    private void sort(int[] arr, int leftBound, int rightBound) {
        if (leftBound >= rightBound) {
            // 如果左边的指针等于右边的指针
            return;
        }
        int mid = partition(arr, leftBound, rightBound);
        sort(arr, leftBound, mid - 1);
        sort(arr, mid + 1, rightBound);
    }


    private int partition(int[] arr, int leftBound, int rightBound) {
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
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int minArray1(int[] numbers) {
        if(numbers.length == 1) return numbers[0];
        if(numbers[0] < numbers[numbers.length - 1]) return numbers[0];
        for(int i = numbers.length - 1; i != 0; --i){
            if(numbers[i] < numbers[i - 1]) return numbers[i];
        }
        return numbers[0];
    }
}