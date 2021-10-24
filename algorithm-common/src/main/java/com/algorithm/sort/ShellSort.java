package com.algorithm.sort;

import com.algorithm.utils.ArraysUtils;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-19 13:47
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 希尔排序
 */
public class ShellSort {


    /**
     * 希尔排序 针对有序序列在插入时采用交换法
     *
     * @param arr
     */
    public static void sort2(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap = 4; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; gap - 1 < j; j -= gap) {
                    if (arr[j] < arr[j - gap]) {
                        //插入排序采用交换法
                        swap(arr, j, j - gap);
                    }
                }
            }
        }
        ArraysUtils.printIntArray(arr);
    }

    /**
     * 希尔排序 针对有序序列在插入时采用交换法
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    //插入排序采用交换法
                    swap(arr, j, j - gap);
                    j -= gap;
                }
            }
        }
        ArraysUtils.printIntArray(arr);
    }


    public static void kunthSort(int[] arr) {
        int h = 1;
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }
        System.out.println("间隔大小：" + h);

        //增量gap，并逐步缩小增量
        for (int gap = h; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    //插入排序采用交换法
                    swap(arr, j, j - gap);
                    j -= gap;
                }
            }
        }
        ArraysUtils.printIntArray(arr);
    }


    /**
     * 希尔排序 针对有序序列在插入时采用移动法。
     *
     * @param arr
     */
    public static void sort1(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        //移动法
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 交换数组元素
     *
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }


    /**
     * 测试点：一步步推导出来希尔排序
     *
     * @param arr
     */
    public static void tuidao(int[] arr) {

        for (int i = 5; i < arr.length; i++) {
            for (int j = i - 5; 0 <= j; j -= 5) {
                int left = arr[j];
                int right = arr[j + 5];
                if (left > right) {
                    int temp = 0;
                    temp = left;
                    arr[j] = right;
                    arr[j + 5] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println("第一次排序" + Arrays.toString(arr));


        for (int i = 2; i < arr.length; i++) {
            for (int j = i - 2; 0 <= j; j -= 2) {
                int left = arr[j];
                int right = arr[j + 2];
                if (left > right) {
                    int temp = 0;
                    temp = left;
                    arr[j] = right;
                    arr[j + 2] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println("第2次排序" + Arrays.toString(arr));


        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; 0 <= j; j -= 1) {
                int left = arr[j];
                int right = arr[j + 1];
                if (left > right) {
                    int temp = 0;
                    temp = left;
                    arr[j] = right;
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println("第3次排序" + Arrays.toString(arr));
    }

    public static void tuidao1(int[] arr) {
        int count = 0;
        for (int gap = arr.length / 2; 0 < gap; gap /= 2) {
            System.out.println("步长：" + gap + " 第" + count + "次排序");
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; 0 <= j; j -= gap) {
                    int left = arr[j];
                    int right = arr[j + gap];
                    if (left > right) {
                        int temp = 0;
                        temp = left;
                        arr[j] = right;
                        arr[j + gap] = temp;
                    }
                    System.out.println(Arrays.toString(arr));
                }

            }
            System.out.println("排序结果" + Arrays.toString(arr));
        }
    }

    public static int[] weiyi(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    //插入排序采用交换法
                    swap(arr, j, j - gap);
                    j -= gap;
                }
            }
        }
        return arr;
    }
}
