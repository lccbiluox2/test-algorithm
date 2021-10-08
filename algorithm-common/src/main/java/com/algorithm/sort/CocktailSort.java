package com.algorithm.sort;

import com.algorithm.utils.ArraysUtils;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-08 20:04
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 鸡尾酒排序
 */
public class CocktailSort {

    public static void sort(int array[]) {
        int tmp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            //有序标记，每一轮的初始值都是true
            boolean isSorted = true;
            //奇数轮，从左向右比较和交换
            for (int j = i; j < array.length - i - 1; j++) {
                ArraysUtils.printIntArray(array);
                int jd = array[j];
                int j1d = array[j + 1];
                if (jd > j1d) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp; // 有元素交换，所以不是有序的，标记变为false
                    isSorted = false;
                }
                ArraysUtils.printIntArray(array);
            }

            if (isSorted) {
                break;
            }
            // 在偶数轮之前，将isSorted重新标记为true
            isSorted = true;//偶数轮，从右向左比较和交换
            for (int j = array.length - i - 1; j > i; j--) {
                ArraysUtils.printIntArray(array);
                int jd = array[j];
                int j1d = array[j - 1];
                if (jd < j1d) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    // 因为有元素进行交换，所以不是有序的，标记变为false
                    isSorted = false;
                }
                ArraysUtils.printIntArray(array);
            }
            if (isSorted) {
                break;
            }
            ArraysUtils.printIntArray(array);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 9, 5, 6, 7, 8, 1};

        sort(array);
         System.out.println(Arrays.toString(array));
    }
}
